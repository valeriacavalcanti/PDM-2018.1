package com.example.ifpb.navegaodetelas

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etNome: EditText
    private lateinit var tvNumero: TextView
    private lateinit var btEnviar: Button

    private val FORM = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etNome = findViewById(R.id.etMainNome)
        this.tvNumero = findViewById(R.id.tvMainNumero)
        this.btEnviar = findViewById(R.id.btMainEnviar)

        this.btEnviar.setOnClickListener({
            val it = Intent(this, FormActivity::class.java)
            it.putExtra("NOME", this.etNome.text.toString())
            //startActivity(it)
            startActivityForResult(it, FORM)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.i("APP", requestCode.toString())
        Log.i("APP", resultCode.toString())

        if (resultCode == Activity.RESULT_OK){
            if (requestCode == FORM){
                this.tvNumero.text = data?.getStringExtra("NUMERO")

            }
        }
    }
}
