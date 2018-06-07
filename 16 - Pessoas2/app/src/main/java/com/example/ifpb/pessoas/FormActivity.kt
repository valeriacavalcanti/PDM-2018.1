package com.example.ifpb.pessoas

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class FormActivity : AppCompatActivity() {
    private lateinit var etNome: EditText
    private lateinit var etIdade: EditText
    private lateinit var btSalvar: Button
    private lateinit var btCancelar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        this.etNome = findViewById(R.id.etFormNome)
        this.etIdade = findViewById(R.id.etFormIdade)
        this.btSalvar = findViewById(R.id.btFormSalvar)
        this.btCancelar = findViewById(R.id.btFormCancelar)

        this.btSalvar.setOnClickListener({ salvar(it) })
        this.btCancelar.setOnClickListener({ cancelar(it) })

        var pessoa = intent.getSerializableExtra("PESSOA")
        if (pessoa != null){
            pessoa = pessoa as Pessoa
            this.etNome.setText(pessoa.nome)
            this.etIdade.setText(pessoa.idade.toString())
        }
    }

    fun salvar(view: View){
        val nome = this.etNome.text.toString()
        val idade = this.etIdade.text.toString().toInt()
        var pessoa = intent.getSerializableExtra("PESSOA")

        if (pessoa == null){
            Log.e("PESSOA", "nova pessoa")
            pessoa = Pessoa(nome, idade)
        }else{
            Log.e("PESSOA", "atualizando pessoa")
            pessoa = pessoa as Pessoa
            pessoa.nome = nome
            pessoa.idade = idade
        }

        var it = Intent()
        it.putExtra("PESSOA", pessoa)
        setResult(Activity.RESULT_OK, it)
        finish()
    }

    fun cancelar(view: View){
        finish()
    }
}
