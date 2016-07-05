/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.n.clean;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class GasNClean 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the amount of gallons of gas you need: ");
        double gallons = sc.nextDouble();
        System.out.println("Please enter the type of gas you need (N for none): ");
        char g = sc.next().toLowerCase().charAt(0);
        System.out.println("Do you want a car wash? (Y or N): ");
        char c = sc.next().toLowerCase().charAt(0);
        boolean wantsWash = false;
        
        if (c == 'y')
        {
            wantsWash = true;
        }
        else
        {
            wantsWash = false;
        }
        
        double gas = 0;
        double carwash = 0;
        
        if (g == 'r')
        {
            gas = gallons * 1.149;
            
            if (gas > 10)
            {
                carwash = 1.25;
            }
            else
            {
                carwash = 3.00;
            }
            System.out.println("Price of gas: " + gas);
            System.out.println("Carwash price: " + carwash);
            if (wantsWash)
            {
                System.out.println("Total: " + (gas + carwash));
            }
            else
            {
                System.out.println("Total: " + gas);
            }
        }
        
        else if (g == 'p')
        {
            gas = gallons * 1.199;
            
            if (gas > 10)
            {
                carwash = 1.25;
            }
            else
            {
                carwash = 3.00;
            }
            System.out.println("Price of gas: " + gas);
            System.out.println("Carwash price: " + carwash);
            if (wantsWash)
            {
                System.out.println("Total: " + (gas + carwash));
            }
            else
            {
                System.out.println("Total: " + gas);
            }
        }
        
        else if (g == 's')
        {
            gas = gallons * 1.289;
            
            if (gas > 10)
            {
                carwash = 1.25;
            }
            else
            {
                carwash = 3.00;
            }
            System.out.println("Price of gas: " + gas);
            System.out.println("Carwash price: " + carwash);
            if (wantsWash)
            {
                System.out.println("Total: " + (gas + carwash));
            }
            else
            {
                System.out.println("Total: " + gas);
            }
        }
        else if (g == 'n')
        {
            System.out.println("Ok thank you for coming!");
        }
    }
    
}
