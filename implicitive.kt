package com.example.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Video.Media
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class implicitive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicitive)
        val url = findViewById<Button>(R.id.button3)
        val camera = findViewById<Button>(R.id.button4)
        val calldial = findViewById<Button>(R.id.button5)
        val picture =findViewById<Button>(R.id.button6)

        url.setOnClickListener{
            val i1=Intent(Intent.ACTION_VIEW,Uri.parse("https://ums.lpu.in/lpuums/"))
            startActivity(i1)
        }
        camera.setOnClickListener{
            val i2=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }
        calldial.setOnClickListener{
            val i3=Intent(Intent.ACTION_DIAL)
            startActivity(i3)
        }
        picture.setOnClickListener{
            val i4=Intent(Intent.ACTION_CALL)
            startActivity(i4)
        }
    }
}



