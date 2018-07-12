//
//  ViewController.swift
//  Bolão
//
//  Created by IFPB on 12/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import UIKit

class FormViewController: UIViewController {
    @IBOutlet weak var tfNome: UITextField!
    @IBOutlet weak var tfGanhador: UITextField!
    
    var cadastro: Cadastro!
    
    @IBAction func salvar(_ sender: Any) {
        let nome = self.tfNome.text
        let ganhador = self.tfGanhador.text
        
        let aposta = Aposta(nome: nome!, ganhador: ganhador!)
        self.cadastro.add(aposta: aposta)
    }
}

