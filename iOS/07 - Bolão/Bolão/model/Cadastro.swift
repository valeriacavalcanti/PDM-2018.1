//
//  Cadastro.swift
//  Bolão
//
//  Created by IFPB on 12/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Cadastro: NSObject, NSCoding {
    var lista: Array<Aposta>!
    
    // construtor memória
    override init() {
        self.lista = Array<Aposta>()
    }
    
    // construtor arquivo
    required init?(coder aDecoder: NSCoder) {
        self.lista = aDecoder.decodeObject(forKey: "lista") as! Array<Aposta>
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.lista, forKey: "lista")
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
