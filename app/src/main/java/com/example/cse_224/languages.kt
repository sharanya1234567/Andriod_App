package com.example.cse_224

import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class languages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_languages)
        var btneng = findViewById<Button>(R.id.buttonEng)
        var btnHin = findViewById<Button>(R.id.buttonHin)

        btneng.setOnClickListener {
            setLocale("en")
        }
        btnHin.setOnClickListener {
            setLocale("hi")
        }
    }
    fun setLocale(langCode : kotlin.String) {
        val current = resources.configuration.locales.get(0).language
        if(langCode != current){
            val l = Locale(langCode)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c, resources.displayMetrics)
        }
        recreate()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                Toast.makeText(this, "language changed", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    }
