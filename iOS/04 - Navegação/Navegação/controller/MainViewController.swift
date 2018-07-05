//
//  ViewController.swift
//  Navegação
//
//  Created by IFPB on 05/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import UIKit

class MainViewController: UIViewController {

    @IBOutlet weak var tfMensagem: UITextField!
    
    @IBAction func navegarForma1(_ sender: Any) {
        let svc = self.storyboard?.instantiateViewController(withIdentifier: "sobre") as! SobreViewController
        
        svc.forma = "Forma 1"
        svc.texto = self.tfMensagem.text
        
        self.present(svc, animated: true, completion: nil)
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if ((segue.identifier == "main_sobre") || (segue.identifier == "nav_main_sobre")){
            let svc = segue.destination as! SobreViewController
            svc.forma = "Forma 2"
            svc.texto = self.tfMensagem.text
        }
    }
}

