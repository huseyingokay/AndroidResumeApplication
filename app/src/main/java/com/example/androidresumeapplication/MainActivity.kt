package com.example.androidresumeapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistoryButton)

        workHistory.setOnClickListener {
            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var call = findViewById<Button>(R.id.callButton)

        call.setOnClickListener {
            var phoneUri = Uri.parse("tel:+905468602936")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        var email = findViewById<Button>(R.id.emailButton)

        email.setOnClickListener {

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf<String>("xrays24680@gmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume :)")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "You are very special!!!")
            startActivity(emailIntent)
        }
    }
}