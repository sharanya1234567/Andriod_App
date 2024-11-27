package com.example.cse_224

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class rateBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rate_box)
        val ratingbar = findViewById<RatingBar>(R.id.rBar)
        ratingbar.setOnClickListener{
            var b = AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do you really want to exit")
            b.setCancelable(false)
            b.setPositiveButton("Yes"){dialog,_ -> finish()}
            b.setNegativeButton("No"){dialog,_ -> dialog.dismiss()}
            b.setNeutralButton("Remind me later"){dialog,_ -> Toast.makeText( this, "Neutral", Toast.LENGTH_SHORT).show()}

            b.create().show()
        }

    }
}