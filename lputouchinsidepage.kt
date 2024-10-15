package com.example.firstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lputouchinsidepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lputouchinsidepage)
        val timetable1 = findViewById<ImageButton>(R.id.imageButton2)
        val timetable2 = findViewById<ImageButton>(R.id.imageButton3)
        val add = findViewById<ImageButton>(R.id.imageButton4)
        val event = findViewById<ImageButton>(R.id.imageButton5)
        val feestatement = findViewById<ImageButton>(R.id.imageButton6)
        val library = findViewById<ImageButton>(R.id.imageButton7)
        val appointment = findViewById<ImageButton>(R.id.imageButton8)

        timetable1.setOnClickListener {
            val i1 = Intent(this, timetablelpu::class.java)
            startActivity(i1)
        }
        timetable2.setOnClickListener {
            val i2 = Intent(this, timetablelpu::class.java)
            startActivity(i2)
        }
        add.setOnClickListener {
            val i3 = Intent(this, menulist::class.java)
            startActivity(i3)
        }
        event.setOnClickListener {
            val i4 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lpu.in/campus-life/intra-university-events.php"))
            startActivity(i4)
        }
        feestatement.setOnClickListener {
            val i5 = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.lpu.in/frmPayment.aspx"))
            startActivity(i5)
        }
        library.setOnClickListener {
            val i6 = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.lpu.in/academics/libraries.php"))
            startActivity(i6)
        }
        appointment.setOnClickListener {
            val i7 = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.lpu.in/student-services/healthcare.php"))
            startActivity(i7)
        }
    }
}
