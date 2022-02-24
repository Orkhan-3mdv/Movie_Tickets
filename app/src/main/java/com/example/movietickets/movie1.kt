package com.example.movietickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class movie1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie1)


        val buyingBtn = findViewById<Button>(R.id.button12)
        val backBtn = findViewById<ImageButton>(R.id.imageButton)

        backBtn.setOnClickListener {
            val intent = Intent(this,BuyTickets::class.java)
            startActivity(intent)
        }


        buyingBtn.setOnClickListener{
            val text = "Ticket Boughted!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}