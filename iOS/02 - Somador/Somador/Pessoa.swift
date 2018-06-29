//
//  Pessoa.swift
//  Somador
//
//  Created by IFPB on 29/06/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Pessoa: NSObject {
    var nome: String!
    
    override var description: String{
        return self.nome
    }
    
    init(nome: String) {
        self.nome = nome
    }
}
