package com.example.ifpb.coisas

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var layout: LinearLayout
    private lateinit var botoes: ArrayList<Button>
    private var funcoes = arrayOf("html", "discar", "ligar", "e-mail", "sms",
                                  "compartilhar texto", "ponto", "rota", "youtube", "foto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.layout = findViewById(R.id.llMain)
        this.botoes = ArrayList()

        this.instanciaBotoes()
    }

    private fun instanciaBotoes(){
        for (i in 0..9){
            val bt = Button(this)
            bt.text = this.funcoes[i]
            bt.width = ViewGroup.LayoutParams.MATCH_PARENT
            bt.height = ViewGroup.LayoutParams.WRAP_CONTENT
            bt.setOnClickListener({ onClick(it) })
            this.botoes.add(bt)
            this.layout.addView(bt)
        }
    }

    fun onClick(view: View){
        Log.i("COISAS", (view as Button).text.toString())
        val indice = this.botoes.indexOf(view)
        Log.e("COISAS", indice.toString())

        when (indice){
            0 -> this.html()
            1 -> this.discar()
            2 -> this.ligar()
            3 -> this.email()
            4 -> this.sms()
            5 -> this.compartilhar_texto()
            6 -> this.ponto()
            7 -> this.rota()
            8 -> this.youtube()
            9 -> this.foto()
        }
    }

    private fun html(){
        val uri = Uri.parse("http://pdm.valeriacavalcanti.com.br")
        val it = Intent(Intent.ACTION_VIEW, uri)
        startActivity(it)
    }

    private fun discar(){

    }

    private fun ligar(){

    }

    private fun email(){

    }

    private fun sms(){

    }

    private fun compartilhar_texto(){

    }

    private fun ponto(){

    }

    private fun rota(){

    }

    private fun youtube(){

    }

    private fun foto(){

    }
}
