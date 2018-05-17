package com.example.ifpb.banco

import android.content.ContentValues
import android.content.Context

/**
 * Created by ifpb on 17/05/18.
 */

class PessoaDAO (var contexto: Context){
    private lateinit var banco: BancoHelper

    init {
        this.banco = BancoHelper(contexto)
    }

    fun inserir(pessoa: Pessoa){
        var cv = ContentValues()
        cv.put("nome", pessoa.nome)
        cv.put("idade", pessoa.idade)
        this.banco.writableDatabase.insert("pessoa", null, cv)
    }

    fun selecionar(): List<Pessoa>{
        var lista = ArrayList<Pessoa>()
        var colunas = arrayOf("id, nome, idade")
        var cursor = this.banco.readableDatabase.query("pessoa", colunas, null, null, null, null, null)

        cursor.moveToFirst()

        do{
            var nome = cursor.getString(cursor.getColumnIndex("nome"))
            var idade = cursor.getInt(cursor.getColumnIndex("idade"))
            var id = cursor.getInt(cursor.getColumnIndex("id"))

            lista.add(Pessoa(nome, idade, id))
        }while (cursor.moveToNext())

        return lista
    }
}