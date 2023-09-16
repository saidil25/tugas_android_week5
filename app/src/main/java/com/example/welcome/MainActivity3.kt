package com.example.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val intent = intent
        val us = intent.getStringExtra("user")
        val ma = intent.getStringExtra("email")
        val ph = intent.getStringExtra("phone")
        val usname = findViewById<TextView>(R.id.user)
        val mail = findViewById<TextView>(R.id.mail)
        val phon = findViewById<TextView>(R.id.phon)
            usname.text = us
            mail.text = ma
            phon.text = ph
    }
}