package ru.education.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val youButton = findViewById<Button>(R.id.YouButton)
        val wEButton = findViewById<Button>(R.id.WEButton)
        val aSSButton = findViewById<Button>(R.id.ASSButton)
        val serGAY = findViewById<TextView>(R.id.SerGAY)
        youButton.setOnClickListener {
            serGAY.text = "You are very Hard GAY"
        }
        wEButton.setOnClickListener {
            serGAY.text = "You are very Very VERY HARD GAY"
        }
        aSSButton.setOnClickListener {
            serGAY.text = "You are very Very VERY VERY HARD GAY"
        }
        serGAY.setOnClickListener {
            serGAY.text = "NE GEY"
        }
    }
}