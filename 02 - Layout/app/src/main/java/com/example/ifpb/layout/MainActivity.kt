package com.example.ifpb.layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_linear_2)
    }

    fun clicou(v: View){
        //Toast.makeText(this, "Clicou, que bom!", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, (v as Button).text, Toast.LENGTH_SHORT).show()

    }
}
