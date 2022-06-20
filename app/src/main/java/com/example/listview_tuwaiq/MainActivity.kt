package com.example.listview_tuwaiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = arrayListOf("APPLE", "CHERRY","GRAPH","BANANA",
            "APPLE ", "CHERRY 1","GRAPH 1","BANANA 1",
            "APPLE 2", "CHERRY 2","GRAPH 2","BANANA 2",
            "APPLE 3", "CHERRY 3","GRAPH 3","BANANA 3",
            "APPLE 4", "CHERRY 4","GRAPH 4","BANANA 4",
            "APPLE 5", "CHERRY 5","GRAPH 5","BANANA 5",)

        var arrayAdapter = ArrayAdapter(this,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item,array)
        list.adapter = arrayAdapter

        list.setOnItemClickListener { adapterView, view, position, l ->
            array.removeAt(position)
            arrayAdapter.notifyDataSetChanged()
        }
        search.addTextChangedListener { text ->
            arrayAdapter.filter.filter(text)
        }
    }
}