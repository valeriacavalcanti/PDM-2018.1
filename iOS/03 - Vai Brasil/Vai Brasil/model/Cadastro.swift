//
//  Cadastro.swift
//  Vai Brasil
//
//  Created by IFPB on 29/06/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Cadastro {
    var lista: Array<Jogo>!
    
    init() {
        self.lista = Array<Jogo>()
    }
    
    func add(pjogo: Jogo) {
        self.lista.append(jogo)
    }
    
    func quantidade() -> Int {
        return self.lista.count
    }
}
