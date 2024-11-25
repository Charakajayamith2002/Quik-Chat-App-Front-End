package com.example.quikchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)


        var groupbutton = findViewById<Button>(R.id.groupbutton)
        groupbutton.setOnClickListener {
            val intent = Intent(this,group ::class.java)
            startActivity(intent)
        }


        var allbtn = findViewById<Button>(R.id.allbtn)
        allbtn.setOnClickListener {
            val intent = Intent(this,dashboard::class.java)
            startActivity(intent)
        }

    }
}