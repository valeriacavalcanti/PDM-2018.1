package com.example.ifpb.pessoas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val INSERT = 1
    val UPDATE = 2
    private lateinit var dao: PessoaDAO
    private lateinit var lvPessoas: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        this.dao = PessoaDAO(this)

        fab.setOnClickListener { view ->
            val it = Intent(this, FormActivity::class.java)
            startActivityForResult(it, INSERT)
        }

        this.lvPessoas = findViewById(R.id.lvMainPessoas)
        this.adapter()

        this.lvPessoas.setOnItemClickListener(OnClick())
        this.lvPessoas.setOnItemLongClickListener(OnLongClick())
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
            val pessoa = data?.getSerializableExtra("PESSOA") as Pessoa
            if (requestCode == INSERT){
                this.dao.insert(pessoa)
            }else if (requestCode == UPDATE){
                this.dao.update(pessoa)
            }
            Log.i("PESSOA", "${pessoa.id} - ${pessoa.nome} - ${pessoa.idade}")
            this.adapter()
        }
    }

    inner class OnClick: AdapterView.OnItemClickListener{
        override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            if (p0 != null) {
                var p = p0.adapter.getItem(p2) as Pessoa
                var it = Intent(this@MainActivity, FormActivity::class.java)
                it.putExtra("PESSOA", p)
                startActivityForResult(it, UPDATE)
            }
        }
    }

    inner class OnLongClick : AdapterView.OnItemLongClickListener{
        override fun onItemLongClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long): Boolean {
            if (p0 != null) {
                var p = p0.adapter.getItem(p2) as Pessoa
                dao.delete(p)
                adapter()
            }
            return true
        }
    }
}
