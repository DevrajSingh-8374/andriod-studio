package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class eduwaveinsidepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eduwaveinsidepage)
        val imageButton = findViewById<ImageButton>(R.id.imageButton14)

        imageButton.setOnClickListener {
            val imageButton = Intent(this, eduwave::class.java)
            startActivity(imageButton)
        }
    }
}