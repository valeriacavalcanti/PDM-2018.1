//
//  ViewController.swift
//  Somador
//
//  Created by IFPB on 28/06/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import UIKit

class MainViewController: UIViewController {
   
    @IBOutlet weak var tfN1: UITextField!
    @IBOutlet weak var tfN2: UITextField!
    @IBOutlet weak var lbResultado: UILabel!
    
    
    @IBAction func somar(_ sender: Any) {
        let num1 = Int(self.tfN1.text!)
        let num2 = Int(self.tfN2.text!)
        let resultado = num1! + num2!
        self.lbResultado.text = String(resultado)
    }
    
    
    
}

