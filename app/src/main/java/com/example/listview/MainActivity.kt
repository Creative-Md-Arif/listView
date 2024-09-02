package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private var player:ArrayList<String> = arrayListOf("Player1", "Player2", "Player3", "Player4", "Player5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, player)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "You clicked on: ${player[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}