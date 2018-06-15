package com.example.ifpb.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etNumero1: EditText
    private lateinit var etNumero2: EditText
    private lateinit var tvResultado: TextView
    private lateinit var btSomar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etNumero1 = findViewById(R.id.etNumero1)
        this.etNumero2 = findViewById(R.id.etNumero2)
        this.tvResultado = findViewById(R.id.tvResultado)
        this.btSomar = findViewById(R.id.btSoma)
        this.btSomar.setOnClickListener({ somar(it) })
    }

    fun somar(view: View){
        var n1 = this.etNumero1.text.toString().toInt()
        var n2 = this.etNumero2.text.toString().toInt()
        this.tvResultado.text = (n1 + n2).toString()
    }
}
