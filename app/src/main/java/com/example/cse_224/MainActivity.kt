package com.example.cse_224

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.linear_layout)
        var a=Toast.makeText (this,"activity visible",Toast.LENGTH_LONG)
        a.show()
    }
    override fun onStart()
    {
        super.onStart()
        var a=Toast.makeText (this,"activity visible",Toast.LENGTH_LONG)
    }

}