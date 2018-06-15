package com.example.ifpb.banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var etNome: EditText
    private lateinit var etIdade: EditText
    private lateinit var btSalvar: Button
    private lateinit var dao: PessoaDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etNome = findViewById(R.id.etNome)
        this.etIdade = findViewById(R.id.etIdade)
        this.btSalvar = findViewById(R.id.btSalvar)

        this.dao = PessoaDAO(this)

        this.btSalvar.setOnClickListener({ salvar(it) })
    }

    fun salvar (view: View){
        val nome = this.etNome.text.toString()
        val idade = this.etIdade.text.toString().toInt()
        val pessoa = Pessoa(nome, idade)

        this.dao.inserir(pessoa)

        Log.i("APP_BANCO", this.dao.selecionar().toString())
    }
}
