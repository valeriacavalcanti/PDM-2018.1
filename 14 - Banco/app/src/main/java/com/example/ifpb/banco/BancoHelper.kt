package com.example.ifpb.banco

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by ifpb on 17/05/18.
 */

val VERSAO = 1

class BancoHelper(context: Context?) :
        SQLiteOpenHelper(context, "pessoa.sqlite", null, VERSAO) {

    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "create table pessoa(" +
                      "id integer primary key autoincrement, " +
                      "nome string," +
                      "idade integer" +
                  ")"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, anterior: Int, atual: Int) {
        db?.execSQL("drop table pessoa")
        this.onCreate(db)
    }

}