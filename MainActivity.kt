package com.example.app_03_celsius_fahrenheit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCelsius = findViewById<EditText>(R.id.txtCelsius)
        val txtResultado = findViewById<TextView>(R.id.txt_Resultado)
        val btnConverter = findViewById<Button>(R.id.btn_Converter)

        btnConverter.setOnClickListener {
            if (txtCelsius.text.isNullOrEmpty()) {
                txtCelsius.error = "Digite a temperatura em Celsius"
            } else {
                val celsius = txtCelsius.text.toString().toDouble()
                val resultado: Double
                resultado = (9 * celsius + 160) / 5
                txtResultado.text =
                    "$celsius graus celsius equivale a $resultado graus " + "Fahrenheit"
                txtCelsius.text.clear()
            }
        }
    }
}
