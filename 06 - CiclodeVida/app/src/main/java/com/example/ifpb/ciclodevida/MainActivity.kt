package com.example.ifpb.ciclodevida

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("APP", "Main - OnCreate")

        this.tvTexto = findViewById(R.id.tvMainTexto)
        this.tvTexto.setOnClickListener({
            Log.i("APP", "Cliquei")
            val it = Intent(this, OutraActivity::class.java)
            startActivity(it)
        })
    }

    override fun onStart() {
        super.onStart()
        Log.i("APP", "Main - OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("APP", "Main - OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("APP", "Main - OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("APP", "Main - OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("APP", "Main - OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("APP", "Main - OnDestroy")
    }
}
