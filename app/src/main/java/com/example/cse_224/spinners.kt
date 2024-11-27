package com.example.cse_224

import android.icu.text.Transliterator.Position
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.view.WindowId
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class spinners : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinners)
        var spin = findViewById<Spinner>(R.id.spin)
        var options = arrayOf("login", "home", "settings")
        var a = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.adapter = a
        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long

            ) {
                when (position) {
                    1 -> Toast.makeText(applicationContext,"hi",Toast.LENGTH_LONG).show()
                    2 -> Toast.makeText(applicationContext,"hlo",Toast.LENGTH_LONG).show()
                    3 -> Toast.makeText(applicationContext,"",Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                TODO("Not yet implemented")
            }
        }
    }
}