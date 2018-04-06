package com.example.ifpb.mvc2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button
    private lateinit var bt5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.bt2 = findViewById(R.id.btDois)
        this.bt2.setOnClickListener(ClickBotao())

        this.bt3 = findViewById(R.id.btTres)
        this.bt3.setOnClickListener(OutroClickBotao())

        this.bt4 = findViewById(R.id.btQuatro)
        this.bt4.setOnClickListener(View.OnClickListener {
            Log.w("MVC2", "Botão 4 foi clicado com sucesso!")
        })

        this.bt5 = findViewById(R.id.btCinco)
        this.bt5.setOnClickListener({ clickBotao5(it) })
    }

    // botão 1
    fun onClick(view: View){
        Log.i("MVC2", "Botão 1 foi clicado com sucesso!")
    }

    // botão 2
    private class ClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            Log.e("MVC2", "Botão 2 foi clicado com sucesso!")
        }
    }

    // botão 3
    inner class OutroClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            Log.w("MVC2", "Botão 3 foi clicado com sucesso!")
            Toast.makeText(this@MainActivity, "Eeeeita", Toast.LENGTH_SHORT).show()
        }
    }

    // botão 5
    fun clickBotao5(view: View){
        Log.v("MVC2", "Botão 5 foi clicado com sucesso!")
    }
}
