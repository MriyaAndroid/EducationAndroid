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
    }

    fun toastME (view: View) {
        val myToast = Toast.makeText(this, "You are very Hard GAY", Toast.LENGTH_SHORT)

            myToast.show()
    }
    fun cauntME (view: View) {

    }
}