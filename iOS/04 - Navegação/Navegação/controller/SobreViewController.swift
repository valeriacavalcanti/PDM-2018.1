//
//  SobreViewController.swift
//  Navegação
//
//  Created by IFPB on 05/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import UIKit

class SobreViewController: UIViewController {
    @IBOutlet weak var lbForma: UILabel!
    @IBOutlet weak var lbTexto: UILabel!
    
    var forma:String!
    var texto: String!
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        self.dismiss(animated: true, completion: nil)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("view did load")
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        print("view will appear")
        self.lbForma.text = self.forma
        self.lbTexto.text = self.texto
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(true)
        print("view did appear")
    }
    
    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(true)
        print("view will disappear")
    }
    
    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(true)
        print("view did disappear")
    }
    
    
}
