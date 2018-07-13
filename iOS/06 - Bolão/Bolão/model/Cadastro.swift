//
//  Cadastro.swift
//  Bolão
//
//  Created by IFPB on 12/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Cadastro {
    var lista: Array<Aposta>!
    
    init() {
        self.lista = Array<Aposta>()
    }
    
    func add(aposta:Aposta) {
        self.lista.append(aposta)
    }
    
    func count() -> Int {
        return self.lista.count
    }
    
    func get(index:Int) -> Aposta {
        return self.lista[index]
    }
    
    func del(index: Int){
        self.lista.remove(at: index)
    }
}
