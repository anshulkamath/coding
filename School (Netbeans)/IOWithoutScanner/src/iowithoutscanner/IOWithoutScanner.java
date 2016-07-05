/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iowithoutscanner;

import javax.swing.JOptionPane;



/**
 *
 * @author 19kamatha
 */
public class IOWithoutScanner 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] scores = new int[3];
        int sum = 0;
        String name = JOptionPane.showInputDialog("Please input a name");
        for (int i = 0; i < 3; i++)
        {
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog("Please input a golf score"));
            sum += scores[i];
            
        }

        JOptionPane.showMessageDialog(null, name + "'s average golf scores " + sum/scores.length);
    }
}
