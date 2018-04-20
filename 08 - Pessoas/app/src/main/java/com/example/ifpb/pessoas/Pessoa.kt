package com.example.ifpb.pessoas

import java.io.Serializable

/**
 * Created by ifpb on 19/04/18.
 */

class Pessoa (
        var nome: String, var idade: Int
):Serializable{
    override fun toString(): String {
        return "Nome: ${nome} - Idade: ${idade}"
    }
}