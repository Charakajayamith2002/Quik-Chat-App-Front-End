package com.example.quikchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class group : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)



        var allbtn = findViewById<Button>(R.id.allbtn)
        allbtn.setOnClickListener {
            val intent = Intent(this,dashboard::class.java)
            startActivity(intent)
        }

        var callbutton = findViewById<Button>(R.id.callbutton)
        callbutton.setOnClickListener {
            val intent = Intent(this,call::class.java)
            startActivity(intent)
        }
    }
}