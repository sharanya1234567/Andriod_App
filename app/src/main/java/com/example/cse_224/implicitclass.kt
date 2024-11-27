package com.example.cse_224

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class implicitclass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicitclass)
        var url = findViewById<Button>(R.id.url)
        var gall = findViewById<Button>(R.id.gallery)
        var cam = findViewById<Button>(R.id.camera)
        var cont = findViewById<Button>(R.id.contacts)
        var micro = findViewById<Button>(R.id.microphone)
        var stor  = findViewById<Button>(R.id.storage)
        var navi = findViewById<Button>(R.id.navigate)

        navi.setOnClickListener{
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.google.co.in"))
            startActivity(i1)
        }

    }
}