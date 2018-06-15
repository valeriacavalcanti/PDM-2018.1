package com.example.ifpb.pessoas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val NOVO = 1
    private lateinit var dao: PessoaDAO
    private lateinit var lvPessoas: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        this.dao = PessoaDAO(this)

        fab.setOnClickListener { view ->
            val it = Intent(this, FormActivity::class.java)
            startActivityForResult(it, NOVO)
        }

        this.lvPessoas = findViewById(R.id.lvMainPessoas)
        this.adapter()
    }

    fun adapter(){
        this.lvPessoas.adapter = ArrayAdapter<Pessoa>(this,
                android.R.layout.simple_list_item_1,
                this.dao.select())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK){
            if (requestCode == NOVO){
                val pessoa = data?.getSerializableExtra("PESSOA") as Pessoa

                this.dao.insert(pessoa)
                this.adapter()
                Log.i("APP_PESSOA", this.dao.select().toString())
            }
        }
    }
}
