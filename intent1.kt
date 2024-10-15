package com.example.firstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.net.Uri

class intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent1)
        val explicitive = findViewById<Button>(R.id.button)
        val implicitive = findViewById<Button>(R.id.button2)

        explicitive.setOnClickListener {
            val i1 = Intent(this, explicitivetpage::class.java)
            startActivity(i1)
        }
        implicitive.setOnClickListener {
            val i2 = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://google.com")
            startActivity(i2)

        }
    }
}