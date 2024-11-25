package com.example.quikchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var loginbtn = findViewById<Button>(R.id.loginbtn)
        loginbtn.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }

    }
}