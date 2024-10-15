package com.example.firstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val email = intent.getStringExtra("EMAIL")
        findViewById<TextView>(R.id.welcomeTextView).text = "Welcome, to gmail "
    }
}