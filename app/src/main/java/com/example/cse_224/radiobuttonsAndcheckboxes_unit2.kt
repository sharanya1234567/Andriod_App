package com.example.cse_224

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse_224.R.id.order

class radiobuttonsAndcheckboxes_unit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radiobuttons_andcheckboxes_unit2)
        var piz=findViewById<RadioGroup>(R.id.rg_id)
        var placeorder=findViewById<Button>(R.id.order)
        var large =  findViewById<RadioButton>(R.id.large)
        var medium = findViewById<RadioButton>(R.id.medium)
        var small = findViewById<RadioButton>(R.id.small)
        var pan= findViewById<CheckBox>(R.id.paneer)
        var pine= findViewById<CheckBox>(R.id.pineApple)
        var olive= findViewById<CheckBox>(R.id.olives)
        var onion=findViewById<CheckBox>(R.id.onions)
        var bell=findViewById<CheckBox>(R.id.bellpepper)


        var select= findViewById<TextView>(R.id.selection_type)
        var option= findViewById<TextView>(R.id.option)


        placeorder.setOnClickListener{
            var size=piz.checkedRadioButtonId
            var finalsize = when(size){
                R.id.large -> "large"
                R.id.medium -> "medium"
                R.id.small -> "small"
                else -> "Choose any option"

            }
            var toppings=mutableListOf<String>()
            if (pan.isChecked) toppings.add("Paneer")
            if (pine.isChecked) toppings.add("pineapple")
            if (olive.isChecked) toppings.add("olives")
            if (onion.isChecked) toppings.add("onions")
            if (bell.isChecked) toppings.add("bellpepper")
            Toast.makeText(
                this,
                "You selected a $finalsize pizza with toppings: $toppings",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}