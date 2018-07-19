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
    var index: Int!
    
    @IBAction func salvar(_ sender: Any) {
        let nome = self.tfNome.text
        let ganhador = self.tfGanhador.text
        
        let aposta = Aposta(nome: nome!, ganhador: ganhador!)
        
        if (self.index != nil){
            self.cadastro.lista[self.index] = aposta
        }else{
            self.cadastro.add(aposta: aposta)
        }
        
        self.navigationController?.popViewController(animated: true)
        //print("Quantidade: \(self.cadastro.count())")
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        
        if (self.index != nil){
            let aposta = self.cadastro.get(index: self.index)
            self.tfNome.text = aposta.nome
            self.tfGanhador.text = aposta.ganhador
        }
        
        self.tfNome.becomeFirstResponder()
    }
}

