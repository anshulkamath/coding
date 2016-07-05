/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardclass;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class CardClass 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter a suit for your card, and then a value (i.e. Spades 4): ");
        Card a = new Card (sc.next(), sc.nextInt());
        
        System.out.println("Please enter another suit for your card, and then a value: ");
        Card b = new Card (sc.next(), sc.nextInt());
        
        if (a.getVal() > b.getVal())
        {
            System.out.println("The bigger value is " + a.getVal());
        }
        else if (a.getVal() < b.getVal())
        {
            System.out.println("The bigger value is " + b.getVal());
        }
        else
        {
            System.out.println("The card values are equal.");
            
        }
       
    }
    
}
