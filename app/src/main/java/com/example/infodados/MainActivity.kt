package com.example.infodados

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_send = findViewById<Button>(R.id.btn_send)
        val edt_name = findViewById<EditText>(R.id.edt_name)
        val edt_age = findViewById<EditText>(R.id.edt_age)
        val edt_email = findViewById<EditText>(R.id.edt_email)
        val edt_CPF = findViewById<EditText>(R.id.edt_cpf)
        val tv_display = findViewById<TextView>(R.id.tv_display)

        btn_send.setOnClickListener{
            tv_display.text = "Nome: ${edt_name.text} \nIdade: ${edt_age.text} \nEmail: ${edt_email.text} \nCPF: ${edt_CPF.text}"
        }
    }
}