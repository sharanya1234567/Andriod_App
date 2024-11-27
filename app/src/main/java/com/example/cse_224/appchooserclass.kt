package com.example.cse_224

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class appchooserclass : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchooserclass)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            shareText("This text is being shared")
        }
    }

    private fun shareText(msg: String) {
        var send: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,msg)
            type = "text/plain"
        }
        var i: Intent = Intent.createChooser(send, "share via")
        startActivity(i)

    }
}