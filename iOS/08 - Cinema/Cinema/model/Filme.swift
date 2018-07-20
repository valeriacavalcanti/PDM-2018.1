//
//  Filme.swift
//  Cinema
//
//  Created by Valéria Cavalcanti on 19/07/2018.
//  Copyright © 2018 Valéria Cavalcanti. All rights reserved.
//

import Foundation

class Filme: NSObject, NSCoding {
    var titulo: String!
    var nota: Int!
    
    override var description: String{
        return self.titulo!
    }
    
    // construtor memória
    init(titulo: String, nota: Int) {
        self.titulo = titulo
        self.nota = nota
    }
    
    // construtor arquivo
    required init?(coder aDecoder: NSCoder) {
        self.titulo = aDecoder.decodeObject(forKey: "titulo") as! String
        self.nota = aDecoder.decodeObject(forKey: "nota") as! Int
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.titulo, forKey: "titulo")
        aCoder.encode(self.nota, forKey: "nota")
    }
}
