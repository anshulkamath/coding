//
//  ViewController.swift
//  Sample
//
//  Created by Anshul Kamath on 6/26/16.
//  Copyright (c) 2016 Anshul Kamath. All rights reserved.
//

import UIKit

class ViewController: UIViewController
{
    @IBOutlet weak var labels: UILabel!
    
    @IBAction func buttonPressed(sender: UIButton)
    {
        // sender is the object that calls the method
        let title = sender.titleForState(.Normal)!
        labels.text = "You clicked the \(title) button"
    }
}