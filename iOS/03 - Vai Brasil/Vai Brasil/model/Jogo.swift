//
//  Jogo.swift
//  Vai Brasil
//
//  Created by IFPB on 29/06/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import Foundation

class Jogo: NSObject {
    var adversario:String!
    var golsBrasil: Int!
    var golsAdversario: Int!
    
    override var description: String{
        return "Brasil \(self.golsBrasil!) X \(self.golsAdversario!) \(self.adversario!)"
    }
    
    init(nome:String, golsBR:Int, golsAdv:Int) {
        self.adversario = nome
        self.golsBrasil = golsBR
        self.golsAdversario = golsAdv
    }
}
