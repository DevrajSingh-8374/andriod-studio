package com.example.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lputouch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lputouch)
        val name = findViewById<EditText>(R.id.editTextText)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val enter = findViewById<Button>(R.id.button7)

        enter.setOnClickListener {
                val i1 = Intent(this, lputouchinsidepage::class.java)
                startActivity(i1)
        }
    }
}