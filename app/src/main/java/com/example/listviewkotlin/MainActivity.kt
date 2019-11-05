package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listview:ListView


    var mobileArray = arrayOf<String>(
        "Android",
        "IPhone",
        "WindowsMobile",
        "Blackberry",
        "WebOS",
        "Ubuntu",
        "Windows7",
        "Max OS X"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listview = findViewById<ListView>(R.id.list)

        val arrayadapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobileArray)
         listview.adapter = arrayadapter


          listview.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->


              // value of item that is clicked
                val selecteditem = adapterView.getItemAtPosition(position) as String
                val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                Toast.makeText(
                    applicationContext,
                    "click item $selecteditem its position $itemIdAtPos",
                    Toast.LENGTH_SHORT
                ).show()


            }
    }}
