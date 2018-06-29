//
//  ViewController.swift
//  Vai Brasil
//
//  Created by IFPB on 29/06/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import UIKit

class MainViewController: UIViewController {

    @IBOutlet weak var tfAdversario: UITextField!
    @IBOutlet weak var lbGolsBrasil: UILabel!
    @IBOutlet weak var lbGolsAdversario: UILabel!
    @IBOutlet weak var stGolsBrasil: UIStepper!
    @IBOutlet weak var stGolsAdversario: UIStepper!
    
    var cadastro = Cadastro()
    
    @IBAction func definirGolsBrasil(_ sender: Any) {
        self.lbGolsBrasil.text = String(Int(self.stGolsBrasil.value))
    }
    
    @IBAction func definirGolsAdversario(_ sender: Any) {
        self.lbGolsAdversario.text = String(Int(self.stGolsAdversario.value))
    }
        
    @IBAction func salvar(_ sender: Any) {
        let adversario = self.tfAdversario.text!
        let golsBR = Int(self.stGolsBrasil.value)
        let golsADV = Int(self.stGolsAdversario.value)
        
        let jogo = Jogo(nome: adversario, golsBR: golsBR, golsAdv: golsADV)
        
        //print(jogo)
        
        self.cadastro.add(pjogo: jogo)
        
        print("Quantidade = \(self.cadastro.quantidade())")
    }
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        self.view.endEditing(true)
    }
    
}

