package com.example.solarsystem.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R
import com.example.solarsystem.adapter.SolarSystemAdapter
import com.example.solarsystem.listener.OrbCardListener

import com.example.solarsystem.repository.SolarSystemRepository

class OrbList : AppCompatActivity(), OrbCardListener {

    private lateinit var orbsList: RecyclerView
    private val orbList = SolarSystemRepository.findAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orb_list)

        val llm = LinearLayoutManager(this)
        val solarSystemAdapter = SolarSystemAdapter(orbList)
        solarSystemAdapter.setOnOrbCardListener(this)

        orbsList = findViewById(R.id.orbs_list)
        orbsList.layoutManager = llm
        orbsList.hasFixedSize()
        orbsList.adapter = solarSystemAdapter
    }

    override fun onCardClick(view: View, position: Int) {
        val it = Intent(this, OrbDetails::class.java)
        it.putExtra("orb_id", position + 1)
        startActivity(it)
    }
}