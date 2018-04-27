package com.example.ifpb.ifpb

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var lvCampi: ListView
    private lateinit var lista: ArrayList<Campus>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lvCampi = findViewById(R.id.lvCampi)
        this.instanciaCampi()

        this.lvCampi.adapter = ArrayAdapter<Campus>(this,
                                                    android.R.layout.simple_list_item_1,
                                                    this.lista)

        this.lvCampi.setOnItemClickListener({ adapterView, view, i, l ->
            Log.i("IFPB", this.lista[i].toString())
        })

        this.lvCampi.setOnItemLongClickListener({ adapterView, view, i, l ->
            Log.e("IFPB", this.lista[i].url)

            val it = Intent()
            it.putExtra("URL", this.lista[i].url)
            setResult(Activity.RESULT_OK, it)
            finish()

            return@setOnItemLongClickListener true
        })
    }

    private fun instanciaCampi(){
        this.lista = ArrayList()
        this.lista.add(Campus("João Pessoa", "http://www.ifpb.edu.br/joaopessoa"))
        this.lista.add(Campus("Campina Grande", "http://www.ifpb.edu.br/campinagrande"))
    }

}
