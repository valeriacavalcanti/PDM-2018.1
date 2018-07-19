//
//  ListarTableViewController.swift
//  Bolão
//
//  Created by IFPB on 12/07/18.
//  Copyright © 2018 IFPB. All rights reserved.
//

import UIKit

class ListarTableViewController: UITableViewController {
    
    var cadastro: Cadastro!

    override func viewDidLoad() {
        super.viewDidLoad()

        let delegate = UIApplication.shared.delegate as! AppDelegate
        self.cadastro = delegate.cadastro
        
        // Uncomment the following line to preserve selection between presentations
        // self.clearsSelectionOnViewWillAppear = false

        // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
        self.navigationItem.leftBarButtonItem = self.editButtonItem
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        self.tableView.reloadData()
    }
    
    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        print(self.cadastro.get(index: indexPath.row).description)
        let fvc = self.storyboard?.instantiateViewController(withIdentifier: "form") as! FormViewController
        
        fvc.cadastro = self.cadastro
        fvc.index = indexPath.row
        
        self.navigationController?.pushViewController(fvc, animated: true)
    }


    // MARK: - Table view data source

    override func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.cadastro.count()
    }


    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        
        let cell = tableView.dequeueReusableCell(withIdentifier: "celula", for: indexPath)

        let aposta = self.cadastro.get(index: indexPath.row)
        
        cell.textLabel?.text = aposta.description

        return cell
    }



    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        return true
    }

    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            self.cadastro.del(index: indexPath.row)
            tableView.deleteRows(at: [indexPath], with: .fade)
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }


    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {

    }



    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }


    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if (segue.identifier == "listar_form"){
            let fvc = segue.destination as! FormViewController
            fvc.cadastro = self.cadastro
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    

}
