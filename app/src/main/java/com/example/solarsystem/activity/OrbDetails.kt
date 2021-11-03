package com.example.solarsystem.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.solarsystem.R
import com.example.solarsystem.R.*
import com.example.solarsystem.repository.SolarSystemRepository

class OrbDetails : AppCompatActivity() {

    private lateinit var orbName: TextView
    private lateinit var orbClassification: TextView
    private lateinit var orbPhoto: ImageView
    private lateinit var orbGravity: TextView
    private lateinit var orbMass: TextView
    private lateinit var orbVolume: TextView
    private lateinit var orbMeanDensity: TextView
    private lateinit var orbSurfaceArea: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_orb_details)

        orbName = findViewById(R.id.orb_name_value)
        orbClassification = findViewById(R.id.orb_classification_value)
        orbPhoto = findViewById(R.id.orb_image_value)
        orbGravity = findViewById(R.id.orb_gravity_value)
        orbMass = findViewById(R.id.orb_mass_value)
        orbVolume = findViewById(R.id.orb_volume_value)
        orbMeanDensity = findViewById(R.id.orb_mean_density_value)
        orbSurfaceArea = findViewById(R.id.orb_surface_area_value)
        val position = intent.getIntExtra("orb_id", -1)

        if (position >= 0){
            SolarSystemRepository.findAll().forEach{
                if (it.id == position){
                    orbName.text = it.name
                    orbClassification.text = it.classification
                    orbPhoto.setImageResource(it.photo)
                    orbGravity.text = it.gravity
                    orbMass.text = it.mass
                    orbVolume.text = it.volume
                    orbMeanDensity.text = it.meanDensity
                    orbSurfaceArea.text = it.surfaceArea
                }
            }
        }


    }
}