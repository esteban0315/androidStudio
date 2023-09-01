package com.evzapp.proyecto1.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.evzapp.proyecto1.R


class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Al arrancar la pantalla se llaman las demás funciones
        val btnStart =
            findViewById<AppCompatButton>(R.id.btnStart) //con esto se está llamando el botón
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                Log.i("Evz", "Clic $name")
                val intent = Intent(this, ResultActivity::class.java) //con esto se llama otras pantallas
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
            }

        }


    }
}