package com.example.ifpb.pessoas

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btNovo: Button
    private lateinit var btListar: Button
    private lateinit var btSobre: Button

    private val NOVO = 1

    private lateinit var lista: ArrayList<Pessoa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lista = ArrayList()

        this.btNovo = findViewById(R.id.btMainNovo)
        this.btListar = findViewById(R.id.btMainListar)
        this.btSobre = findViewById(R.id.btMainSobre)

        this.btNovo.setOnClickListener({
            val it = Intent(this@MainActivity, FormActivity::class.java)
            startActivityForResult(it, NOVO)
        })

        this.btListar.setOnClickListener({
            for (p in this.lista){
                Log.i("APP", p.toString())
            }
        })

        this.btSobre.setOnClickListener({
            val it = Intent(this@MainActivity, SobreActivity::class.java)
            it.putExtra("QUANTIDADE", this.lista.size)
            startActivity(it)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK){
            if (requestCode == NOVO){
                this.lista.add(data?.getSerializableExtra("PESSOA") as Pessoa)
            }
        }
    }

}
