package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class InletExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inletexample)

        // Initialize UI elements
        val emailEditText: EditText = findViewById(R.id.editTextUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val loginButton: Button = findViewById(R.id.buttonLogin)

        // Set click listener for login button
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show()
            } else {
                if (email.contains("@gmail.com")) {
                    // Navigate to welcome page
                    val intent = Intent(this, WelcomeActivity::class.java)
                    intent.putExtra("EMAIL", email)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Please enter a valid Gmail address", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}