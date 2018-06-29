//
//  Cadastro.swift
//  Somador
//
//  Created by IFPB on 29/06/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Cadastro {
    var lista: Array<Pessoa>!
    
    init() {
        self.lista = Array<Pessoa>()
    }
    
    func add(p: Pessoa) {
        self.lista.append(p)
    }
    
    func qtde() -> Int {
        return self.lista.count
    }
}
