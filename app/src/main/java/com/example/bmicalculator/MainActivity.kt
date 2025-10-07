package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etWeight: EditText
    private lateinit var etHeight: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etWeight = findViewById(R.id.etWeight)
        etHeight = findViewById(R.id.etHeight)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val weightStr = etWeight.text.toString()
            val heightStr = etHeight.text.toString()

            if (weightStr.isNotEmpty() && heightStr.isNotEmpty()) {
                val weight = weightStr.toFloat()
                val height = heightStr.toFloat() / 100  // cm to meter
                val bmi = weight / (height * height)

                val resultText = when {
                    bmi < 18.5 -> "Underweight (BMI: %.2f)".format(bmi)
                    bmi < 24.9 -> "Normal (BMI: %.2f)".format(bmi)
                    bmi < 29.9 -> "Overweight (BMI: %.2f)".format(bmi)
                    else -> "Obese (BMI: %.2f)".format(bmi)
                }

                tvResult.text = resultText
            } else {
                tvResult.text = "Please enter weight and height"
            }
        }
    }
}
