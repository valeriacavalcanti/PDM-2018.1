//
//  Aposta.swift
//  Bolão
//
//  Created by IFPB on 12/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Aposta: NSObject {
    var nome: String!
    var ganhador: String!
    
    override var description: String{
        return "\(self.nome) - \(self.ganhador)"
    }
    
    init(nome: String, ganhador:String) {
        self.nome = nome
        self.ganhador = ganhador
    }
}
