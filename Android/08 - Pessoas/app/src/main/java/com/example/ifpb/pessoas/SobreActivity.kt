package com.example.ifpb.pessoas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SobreActivity : AppCompatActivity() {
    private lateinit var tvQtde: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        this.tvQtde = findViewById(R.id.tvSobreQuantidade)

        val qtde = intent.getIntExtra("QUANTIDADE", -1)

        this.tvQtde.text = qtde.toString()

        this.tvQtde.setOnClickListener({
            finish()
        })
    }
}
