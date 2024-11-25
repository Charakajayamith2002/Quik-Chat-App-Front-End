package com.example.quikchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onbordingscreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbordingscreen1)



        var startbutton = findViewById<Button>(R.id.startbutton)
        startbutton.setOnClickListener {
            val intent = Intent(this, onbordingscreen2::class.java)
            startActivity(intent)

        }
    }
}