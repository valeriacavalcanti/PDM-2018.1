package com.example.ifpb.pessoas

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
        this.btCancelar.setOnClickListener({
            finish()
        })
    }

    fun salvar(v: View){
        val nome = this.etNome.text.toString()
        val idade = this.etIdade.text.toString().toInt()

        val p = Pessoa(nome, idade)

        var it = Intent()
        it.putExtra("PESSOA", p)

        setResult(Activity.RESULT_OK, it)
        finish()
    }
}
