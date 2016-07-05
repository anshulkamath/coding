/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        int counter = 1;
        double hcount = 0;
        double chcount = 0;
        while (counter != 0)
        {
            System.out.println("Please enter your order (i.e. ch 2)(0 to quit): ");
            double quan = sc.nextInt();
            String name = sc.next();
            if (name.equals("ch"))
            {
                chcount += quan;
            }
            else if (name.equals("h"))
            {
                hcount+= quan;
            }
            else if (name.equals("0"))
            {
                counter = 0;
            }  
        }
        double hamPrice = hcount * 1.19;
        double chPrice = chcount * 1.39;
        double total = Math.round((hamPrice + chPrice) * 1.05 * 100.0) / 100.0;
        
        System.out.println("Total: " + total);
        System.out.println("Sales Tax: " + (hamPrice + chPrice) * .05);
        System.out.println("Please enter customer payout: ");
        
        double payment = sc.nextDouble();
        double change = payment - ((hamPrice + chPrice) * 1.05);
        
        if ((payment - Math.round((hamPrice + chPrice) * 1.05 * 100.0) / 100.0) < 0)
        {
            System.out.println("You are trying to cheat me! ¡ Vete!");
        }
        else
        {
            System.out.println("Your change: " + (payment - Math.round((hamPrice + chPrice) * 1.05 * 100.0) / 100.0));
        }
    }
    
}
