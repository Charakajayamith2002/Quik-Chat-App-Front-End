package com.example.quikchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var groupbutton = findViewById<Button>(R.id.groupbutton)
        groupbutton.setOnClickListener {
            val intent = Intent(this,group ::class.java)
            startActivity(intent)
        }



        var callbutton = findViewById<Button>(R.id.callbutton)
        callbutton.setOnClickListener {
            val intent = Intent(this,call::class.java)
            startActivity(intent)
        }

        var textname1 = findViewById<TextView>(R.id.textname1)
        textname1.setOnClickListener {
            val intent = Intent(this,chat::class.java)
            startActivity(intent)
        }


        var textchat1 = findViewById<TextView>(R.id.textchat1)
        textchat1.setOnClickListener {
            val intent = Intent(this,chat::class.java)
            startActivity(intent)
        }


    }
}