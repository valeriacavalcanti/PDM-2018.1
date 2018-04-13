package com.example.ifpb.navegaodetelas

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FormActivity : AppCompatActivity() {
    private lateinit var tvNome: TextView
    private lateinit var etNumero: EditText
    private lateinit var btEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        this.tvNome = findViewById(R.id.tvFormNome)
        this.etNumero = findViewById(R.id.etFormNumero)
        this.btEnviar = findViewById(R.id.btFormEnviar)

        this.tvNome.text = intent.getStringExtra("NOME")

        this.btEnviar.setOnClickListener({
            var it = Intent()
            it.putExtra("NUMERO", this.etNumero.text.toString())
            setResult(Activity.RESULT_OK, it)
            finish()
        })
    }
}
