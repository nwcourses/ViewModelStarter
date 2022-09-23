package com.example.viewmodelstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private var currentSong = Song()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // For info, to show you when onCreate() is called
        AlertDialog.Builder(this).setPositiveButton("OK", null)
            .setMessage("onCreate() called").show()


        findViewById<Button>(R.id.btnGo).setOnClickListener {
            currentSong = Song (
                findViewById<EditText>(R.id.etTitle).text.toString(),
                findViewById<EditText>(R.id.etArtist).text.toString()
            )
            findViewById<TextView>(R.id.tvName).text = "${currentSong.title} by ${currentSong.artist}"
        }
    }
}