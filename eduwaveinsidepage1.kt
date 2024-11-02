package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class eduwaveinsidepage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eduwaveinsidepage1)
        val nextbutton = findViewById<Button>(R.id.button12)
        nextbutton.setOnClickListener {
            val nextbutton = Intent(this, eduwave::class.java)
            startActivity(nextbutton)
        }
    }
}
