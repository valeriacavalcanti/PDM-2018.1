//
//  Aposta.swift
//  Bolão
//
//  Created by IFPB on 12/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Aposta: NSObject, NSCoding {
    var nome: String!
    var ganhador: String!
    
    override var description: String{
        return "\(self.nome!) - \(self.ganhador!)"
    }
    
    // construtor com informações da memória
    init(nome: String, ganhador:String) {
        self.nome = nome
        self.ganhador = ganhador
    }
    
    // construtor com informações do arquivo
    required init?(coder aDecoder: NSCoder) {
        self.nome = aDecoder.decodeObject(forKey: "nome") as! String
        self.ganhador = aDecoder.decodeObject(forKey: "ganhador") as! String
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.nome, forKey: "nome")
        aCoder.encode(self.ganhador, forKey: "ganhador")
    }
}
