//
//  ViewController.swift
//  Cinema
//
//  Created by Valéria Cavalcanti on 19/07/2018.
//  Copyright © 2018 Valéria Cavalcanti. All rights reserved.
//

import UIKit

class FormViewController: UIViewController {
    @IBOutlet weak var tfTitulo: UITextField!
    @IBOutlet weak var lbNota: UILabel!
    @IBOutlet weak var stNota: UIStepper!
    
    var index: Int!
    var cadastro: Cadastro!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let delegate = UIApplication.shared.delegate as! AppDelegate
        self.cadastro = delegate.cadastro
    }
    
    @IBAction func definirNota(_ sender: Any) {
        let nota = Int(self.stNota.value)
        self.lbNota.text = String(nota)
    }
    
    @IBAction func salvar(_ sender: Any) {
        let titulo = self.tfTitulo.text!
        let nota = Int(self.stNota.value)
        let filme = Filme(titulo: titulo, nota: nota)
        
        if (self.index != nil){
            self.cadastro.update(index: self.index, filme: filme)
        }else{
            self.cadastro.add(filme: filme)
        }
        
        self.navigationController?.popViewController(animated: true)
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        
        if (self.index != nil){
            let filme = self.cadastro.get(index: self.index)
            self.tfTitulo.text = filme.titulo
            self.lbNota.text = String(filme.nota)
            self.stNota.value = Double(filme.nota)
        }
        
        self.tfTitulo.becomeFirstResponder()
    }
    
}

