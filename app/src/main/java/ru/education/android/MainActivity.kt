package ru.education.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var minus: Button
    lateinit var plus: Button
    lateinit var umnoshit: Button
    lateinit var delete: Button
    lateinit var numberOne: EditText
    lateinit var numberTwo: EditText
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initById()
        setListeners()
    }

    private fun initById() {
        result = findViewById(R.id.result)
        numberOne = findViewById(R.id.numberOne)
        numberTwo = findViewById(R.id.numberTwo)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        umnoshit = findViewById(R.id.umnoshit)
        delete = findViewById(R.id.delete)
    }

    private fun setListeners() {
        minus.setOnClickListener {
            val numberOne = numberOne.text.toString()
            val numberTwo = numberTwo.text.toString()
            val minus = "-"
            getResultMinus(numberOne, numberTwo)
        }
        plus.setOnClickListener {
            val numberOne = numberOne.text.toString()
            val numberTwo = numberTwo.text.toString()
            val plus = "+"
            getResultPlus(numberOne, numberTwo)
        }
        umnoshit.setOnClickListener {
            val numberOne = numberOne.text.toString()
            val numberTwo = numberTwo.text.toString()
            val umnoshit = "*"
            getResultUmnoshit(numberOne, numberTwo)
        }
        delete.setOnClickListener {
            val numberOne = numberOne.text.toString()
            val numberTwo = numberTwo.text.toString()
            val delete = "/"
            getResultDelete(numberOne, numberTwo)
        }
    }

    //if else = getResult

    fun getResult() {
    // if (znak == "-") {
    // выполнит если минус
    // } else if (znak == "/") {
    // выполнит если деление
    // } else if (znak == "*") {
    //  выполнит если умножить
    // } else if (znak == "+"){
    //  выполнит если плюс
    // }
    }

    private fun getResultDelete(numberOne: String, numberTwo: String) {
        val result = numberOne.toInt() / numberTwo.toInt()
        this.result.text = result.toString()
    }

    private fun getResultUmnoshit(numberOne: String, numberTwo: String) {
        val result = numberOne.toInt() * numberTwo.toInt()
        this.result.text = result.toString()
    }

    private fun getResultPlus(numberOne: String, numberTwo: String) {
        val result = numberOne.toInt() + numberTwo.toInt()
        this.result.text = result.toString()
    }

    private fun getResultMinus(numberOne: String, numberTwo: String) {
        val result = numberOne.toInt() - numberTwo.toInt()
        this.result.text = result.toString()
    }
}
