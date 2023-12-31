package com.stressMaker.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val txtResult = findViewById<TextView>(R.id.txtResult)

        val name: String = intent.extras?.getString("extra_name").orEmpty()

        txtResult.text = "Hola $name"

    }
}