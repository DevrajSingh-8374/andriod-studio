package com.example.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class eduwave : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eduwave)

        // Set up the toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val imageView=findViewById<ImageView>(R.id.imageView2)
        val button=findViewById<Button>(R.id.button14)
        imageView.setOnClickListener{
            val imageView = Intent(this, eduwaveinsidepage::class.java)
            startActivity(imageView)
        }
        button.setOnClickListener{
            val button = Intent(this, eduwaveinsidepage::class.java)
            startActivity(button)
        }

        // Find the ImageView and set a click listener
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        profileImage.setOnClickListener { view ->
            // Show the popup menu when the image is clicked
            showPopupMenu(view)
        }
    }

     fun showPopupMenu(view: View) {
        // Create a PopupMenu
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.eduwavemenubar, popupMenu.menu) // Inflate the popup menu layout

        // Set click listener for each menu item
        popupMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_call -> {
                    val phone = "tel:8936890994" // Changed to 'tel:' for dialing
                    Toast.makeText(this, "Call option selected", Toast.LENGTH_LONG).show()
                    val intent = Intent(Intent.ACTION_DIAL).apply {
                        data = Uri.parse(phone)
                    }
                    startActivity(intent)
                    true
                }

                R.id.menu_gmail -> {
                    Toast.makeText(this, "Gmail option selected", Toast.LENGTH_LONG).show()
                    val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:") // Only email apps should handle this
                        putExtra(Intent.EXTRA_EMAIL, arrayOf("example@gmail.com"))
                        putExtra(Intent.EXTRA_SUBJECT, "Subject here")
                    }
                    startActivity(emailIntent)
                    true
                }

                R.id.menu_feedback -> {
                    Toast.makeText(this, "Feedback option selected", Toast.LENGTH_LONG).show()
                    val feedbackIntent = Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.vectorstock.com/royalty-free-vector/feedback-form-vector-15232258")
                    )
                    startActivity(feedbackIntent)
                    true
                }

                else -> false
            }
        }
        popupMenu.show() // Show the popup menu
    }
}
