/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativefastfood;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class IterativeFastFood {

    /**
     * @param args the command line arguments
     */
    
    public static void printdaystotals (int ch, int h, double t)
    {
        System.out.println("There were " + ch + " cheeseburgers sold today.");
        System.out.println("There were " + h + " hamburgers sold today.");
        System.out.println("Total: " + t);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        double totalPay = 0;
        int hamC = 0;
        int chC = 0;
        int customers = 0;
        while (true)
        {
            double hcount = 0;
            double chcount = 0;
            while (true)
            {
                System.out.println("Please enter your order (i.e. ch 2)(0 to quit): ");
                String name = sc.next();
                double quan = sc.nextInt();
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
                    break;
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
            
            hamC += hcount;
            chC += chcount;
            totalPay += total;
            customers++;
            
            System.out.println("Is there another customer (y/n)? ");
            char b = sc.next().toLowerCase().charAt(0);
            if (b == 'n')
            {
                printdaystotals (chC, hamC, totalPay);
                break;
            }
        }
    }
    
}
