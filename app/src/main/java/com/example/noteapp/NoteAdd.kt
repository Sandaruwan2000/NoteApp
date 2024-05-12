package com.example.noteapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.noteapp.databinding.ActivityNoteAddBinding
import com.example.noteapp.databinding.ActivityNoteBinding

class NoteAdd : AppCompatActivity() {

     private  lateinit var binding:ActivityNoteAddBinding
     private  lateinit var  db : Databsehelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Databsehelper( this)

        binding.save.setOnClickListener{
            val title = binding.theam.text.toString()
            val content = binding.message.text.toString()
            val note = Task(0,title,content)
            db.insertNote(note)
            finish()
            Toast.makeText(this,"Note Saved",Toast.LENGTH_SHORT).show()
        }
    }
}