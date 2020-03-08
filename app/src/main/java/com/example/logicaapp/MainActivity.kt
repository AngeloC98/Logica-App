package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        button.setOnClickListener{ checkAnswers() }
    }

    fun checkAnswers() {
        var answer1: String = etAnswer1.text.toString().toLowerCase()
        var answer2: String = etAnswer2.text.toString().toLowerCase()
        var answer3: String = etAnswer3.text.toString().toLowerCase()
        var answer4: String = etAnswer4.text.toString().toLowerCase()
        var correctAnswers: Int = 0;

        if (answer1 == "t") { correctAnswers++ }
        if (answer2 == "f") { correctAnswers++ }
        if (answer3 == "f") { correctAnswers++ }
        if (answer4 == "f") { correctAnswers++ }

        Toast.makeText(this, getString(R.string.toast_correct, correctAnswers), Toast.LENGTH_SHORT).show()
    }
}
