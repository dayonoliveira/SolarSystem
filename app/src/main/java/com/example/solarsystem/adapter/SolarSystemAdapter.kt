package com.example.solarsystem.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R
import com.example.solarsystem.listener.OrbCardListener
import com.example.solarsystem.model.Orb

class SolarSystemAdapter(private val orbs: List<Orb>):RecyclerView.Adapter<SolarSystemAdapter.OrbsViewHolder>() {

    private var listener: OrbCardListener? = null

    class OrbsViewHolder(item: View, listener: OrbCardListener?): RecyclerView.ViewHolder(item){
        val orbImage: ImageView = item.findViewById(R.id.orb_image)
        val orbName: TextView = item.findViewById(R.id.orb_name)
        val orbType: TextView = item.findViewById(R.id.orb_classification)

        init {
            item.setOnClickListener {
                listener?.onCardClick(it, adapterPosition)
            }
        }
    }

    fun setOnOrbCardListener(listener: OrbCardListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrbsViewHolder {
        val item: View = LayoutInflater.from(parent.context).inflate(R.layout.card_orb_list, parent, false)
        return OrbsViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: OrbsViewHolder, position: Int) {
        holder.orbImage.setImageResource(orbs[position].photo)
        holder.orbName.text = orbs[position].name
        holder.orbType.text = orbs[position].classification
    }

    override fun getItemCount(): Int {
        return orbs.size
    }

}