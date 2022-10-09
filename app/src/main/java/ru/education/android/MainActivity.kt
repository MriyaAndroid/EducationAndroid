package ru.education.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// : -> наследование
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text = "Russia"
        }
    }

    //Run
    //I/System.out: onStart

    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    //I/System.out: onStop
    override fun onStop() {
        super.onStop()
        println("onStop")
    }

}