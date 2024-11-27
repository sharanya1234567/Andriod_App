package com.example.cse_224

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class linearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_unit2layout)

        var a = findViewById<EditText>(R.id.editText1)
        var b = findViewById<EditText>(R.id.editText2)
        var btn = findViewById<Button>(R.id.button)
        var t = findViewById<TextView>(R.id.textview1)
        btn.setOnClickListener{
            var name =a.text.toString()
            var regNum =b.text.toString()
            t.text="my name is "+name+ "and reg num is "+regNum


        }

    }
}