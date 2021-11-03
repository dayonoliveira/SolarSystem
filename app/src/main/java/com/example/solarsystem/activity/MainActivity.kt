package com.example.solarsystem.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.solarsystem.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.start_orb_list)

        startButton.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        val it = Intent(this, OrbList::class.java)
        startActivity(it)
    }
}