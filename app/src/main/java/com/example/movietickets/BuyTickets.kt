package com.example.movietickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BuyTickets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_tickets)

        val bt1 = findViewById<Button>(R.id.button2)
        val bt2 = findViewById<Button>(R.id.button5)

        bt1.setOnClickListener{
            val intent = Intent(this,movie1::class.java)
            startActivity(intent)

        }
        bt2.setOnClickListener{
            val intent = Intent(this,movie2::class.java)
            startActivity(intent)
        }

    }
}