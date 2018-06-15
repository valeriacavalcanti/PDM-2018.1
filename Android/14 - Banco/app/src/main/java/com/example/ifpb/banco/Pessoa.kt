package com.example.ifpb.banco

/**
 * Created by ifpb on 17/05/18.
 */

class Pessoa (var nome: String, var idade: Int, var id: Int = -1){

    override fun toString(): String {
        return "${this.nome} - ${this.idade}"
    }
}