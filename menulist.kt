package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menulist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menulist)
        val searchBar = findViewById<EditText>(R.id.searchBar)

        // Setting up click listeners for each button
        findViewById<Button>(R.id.item1).setOnClickListener { showToast("Alumni Mentor Selection is added") }
        findViewById<Button>(R.id.item2).setOnClickListener { showToast("Assignment (CA) Selection is added ") }
        findViewById<Button>(R.id.item3).setOnClickListener { showToast("Backlog Registration Selection is added") }
        findViewById<Button>(R.id.item4).setOnClickListener { showToast("Book Appointment Selection is added") }
        findViewById<Button>(R.id.item5).setOnClickListener { showToast("Campus Tour Selection is added") }
        findViewById<Button>(R.id.item6).setOnClickListener { showToast("Continue Exit Undertaking clicked") }
        findViewById<Button>(R.id.item7).setOnClickListener { showToast("Doctor Appointment Selection is added") }
        findViewById<Button>(R.id.item8).setOnClickListener { showToast("Document Upload Selection is added") }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}