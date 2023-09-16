package com.example.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
        val btn = findViewById<Button>(R.id.tombol)
        btn.setOnClickListener(View.OnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("user", user.text.toString())
            intent.putExtra("email", email.text.toString())
            intent.putExtra("phone", phone.text.toString())
            startActivity(intent)
        })


    }
}