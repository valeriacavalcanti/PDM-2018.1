package com.example.ifpb.mvc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btPrimeiro: Button
    private lateinit var btSegundo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btPrimeiro = findViewById(R.id.btPrimeiro)
        this.btPrimeiro.setOnClickListener(ClickBotao())

        this.btSegundo = findViewById(R.id.btSegundo)
        this.btSegundo.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "eita", Toast.LENGTH_SHORT).show()
        })
    }

    inner class ClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            Toast.makeText(this@MainActivity, "Funciona", Toast.LENGTH_SHORT).show()
        }
    }
}
