package com.example.ifpb.ciclodevida

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class OutraActivity : AppCompatActivity() {
    private lateinit var tvTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        Log.e("APP", "Outra - onCreate")

        this.tvTexto = findViewById(R.id.tvOutraTexto)
        this.tvTexto.setOnClickListener({
            finish()
        })
    }

    override fun onStart() {
        super.onStart()
        Log.e("APP", "Outra - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("APP", "Outra - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("APP", "Outra - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("APP", "Outra - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("APP", "Outra - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("APP", "Outra - OnDestroy")
    }
}
