package com.example.noteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Note : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val add = findViewById<ImageView>(R.id.add)
        add.setOnClickListener(){

            val intent = Intent(this, NoteAdd::class.java)
            startActivity(intent)
        }

    }
}