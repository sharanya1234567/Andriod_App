package com.example.cse_224

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listview_demo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listview_demo)
        val data = findViewById<EditText>(R.id.editlist)
        val add = findViewById<Button>(R.id.button)
        val listv = findViewById<ListView>(R.id.listView)
        var b = ArrayList<String>()
        var d: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_2,b)
        listv.adapter=d
        add.setOnClickListener {
            var item = data.text.toString()
            if(item.isNotEmpty()){
                b.add(item)
                data.text.clear()
                d.notifyDataSetChanged()
            }
            else{
                Toast.makeText(this, "no data entered",Toast.LENGTH_LONG).show()
            }

        }
    }
}
