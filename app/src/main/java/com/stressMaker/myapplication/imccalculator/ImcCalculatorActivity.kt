package com.stressMaker.myapplication.imccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.stressMaker.myapplication.R
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView
    private lateinit var txtHeight:TextView
    private lateinit var rsHeight:RangeSlider
    private lateinit var btnPlus:FloatingActionButton
    private lateinit var btnMin:FloatingActionButton
    private lateinit var txtWeight:TextView
    private lateinit var txtAge:TextView
    private lateinit var btnMinAge:FloatingActionButton
    private lateinit var btnPlusAge:FloatingActionButton

    private var isMale:Boolean = true
    private  var isFemale:Boolean = false

    private var weight:Int = 60;
    private var age:Int = 28

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.cardMale)
        viewFemale = findViewById(R.id.cardFemale)
        txtHeight = findViewById(R.id.txtHeight)
        rsHeight = findViewById(R.id.rsHeight)
        txtWeight = findViewById(R.id.txtWeight)
        btnPlus = findViewById(R.id.btnPlus)
        btnMin = findViewById(R.id.btnMin)
        txtAge = findViewById(R.id.txtAge)
        btnMinAge = findViewById(R.id.btnMinAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
    }

    private fun initUI() {
        setWeight()
        setAge()
    }

    private fun initListeners() {
        viewMale.setOnClickListener { setGenderColor(false) }

        viewFemale.setOnClickListener { setGenderColor(true) }

        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            val res = df.format(value)
            txtHeight.text = "$res cm"
        }

        btnMin.setOnClickListener{
            weight -= 1
            setWeight()
        }

        btnPlus.setOnClickListener{
            weight += 1
            setWeight()
        }

        btnPlusAge.setOnClickListener {
            age += 1
            setAge()
        }

        btnMinAge.setOnClickListener{
            age -= 1
            setAge()
        }
    }

    private fun setGenderColor(isMacho:Boolean) {
        val colorSelected = ContextCompat.getColor(this,R.color.background_component_selected)
        val colorUnselected = ContextCompat.getColor(this,R.color.background_component)

        if(isMacho) {
            viewMale.setCardBackgroundColor(colorUnselected)
            viewFemale.setCardBackgroundColor(colorSelected)
        } else {
            viewFemale.setCardBackgroundColor(colorUnselected)
            viewMale.setCardBackgroundColor(colorSelected)
        }
    }

    private fun setWeight() {
        txtWeight.text = "${weight.toString()} Kg"
    }

    private fun setAge() {
        txtAge.text = age.toString()
    }
}