package com.example.viewmodelstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private var currentName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlertDialog.Builder(this).setPositiveButton("OK", null)
            .setMessage("onCreate()").show()


        findViewById<Button>(R.id.btnGo).setOnClickListener {
            currentName = findViewById<EditText>(R.id.etName).text.toString()
            findViewById<TextView>(R.id.tvName).text = currentName
        }
    }
}