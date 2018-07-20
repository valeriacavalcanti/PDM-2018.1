//
//  SobreViewController.swift
//  Cinema
//
//  Created by Valéria Cavalcanti on 19/07/2018.
//  Copyright © 2018 Valéria Cavalcanti. All rights reserved.
//

import UIKit

class SobreViewController: UIViewController {
    @IBOutlet weak var lbQuantidade: UILabel!
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        
        let delegate = UIApplication.shared.delegate as! AppDelegate
        self.lbQuantidade.text = String(delegate.cadastro.count())
    }
}
