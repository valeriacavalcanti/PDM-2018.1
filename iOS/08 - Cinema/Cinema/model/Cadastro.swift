//
//  Cadastro.swift
//  Cinema
//
//  Created by Valéria Cavalcanti on 19/07/2018.
//  Copyright © 2018 Valéria Cavalcanti. All rights reserved.
//

import Foundation

class Cadastro: NSObject, NSCoding {
    var lista: Array<Filme>!
    
    // construtor memória
    override init() {
        self.lista = Array<Filme>()
    }
    
    // construtor arquivo
    required init?(coder aDecoder: NSCoder) {
        self.lista = aDecoder.decodeObject(forKey: "lista") as! Array<Filme>
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.lista, forKey: "lista")
    }
    
    func add(filme: Filme) {
        self.lista.append(filme)
    }
    
    func count() -> Int {
        return self.lista.count
    }
    
    func get(index: Int) -> Filme {
        return self.lista[index]
    }
    
    func del(index: Int) {
        self.lista.remove(at: index)
    }
    
    func swap(origem: Int, destino: Int) {
        let filme = self.lista[origem]
        self.lista[origem] = self.lista[destino]
        self.lista[destino] = filme
    }
    
    func update(index: Int, filme: Filme) {
        self.lista[index] = filme
    }
}
