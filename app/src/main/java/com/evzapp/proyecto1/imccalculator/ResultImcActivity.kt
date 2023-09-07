package com.evzapp.proyecto1.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.evzapp.proyecto1.R
import com.evzapp.proyecto1.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultImcActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 -> { //Bajo peso
                tvResult.text = getString(R.string.titlleLowWeight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.lowWeight))

                tvDescription.text = getString(R.string.descriptionLowWeight)
            }
            in 18.51..24.99 -> { //peso normal
                tvResult.text = getString(R.string.titlleNormal)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.normalWeight))
                tvDescription.text = getString(R.string.descriptionNormal)
            }
            in 25.00..29.99 -> { //sobrepeso
                tvResult.text = getString(R.string.titlleOverWeight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.overWeight))
                tvDescription.text = getString(R.string.descriptionOverWeight)
            }
            in 30.00..99.99 -> { //obesidad
                tvResult.text = getString(R.string.titlleObesity)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.obesity))
                tvDescription.text = getString(R.string.descriptionObesity)
            }else -> {
            tvResult.text = getString(R.string.ResultError)
            tvIMC.text = getString(R.string.error)
            tvResult.setTextColor(ContextCompat.getColor(this,R.color.error))
            tvDescription.text = getString(R.string.DescriptionError)
            }

        }
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnReCalculate)
    }
}