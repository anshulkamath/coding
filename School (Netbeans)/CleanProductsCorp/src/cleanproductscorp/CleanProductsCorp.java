/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleanproductscorp;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class CleanProductsCorp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter your position and sales: ");
        char p = sc.next().toLowerCase().charAt(0);
        double fw = sc.nextInt() * 13.95;
        double soap = sc.nextInt() * 17.95;
        double windcleaner = sc.nextInt() * 29.95;
        double total = 0;
        
        if (p == 's')
        {
            total = fw + soap + windcleaner;
            if (total > 300)
            {
                System.out.println("The total amount of sales for floor wax: " + fw);
                System.out.println("The total amount of sales for soap: " + soap);
                System.out.println("The total amount of sales for window cleaner: " + windcleaner);
                System.out.println("Total in sales: " + total);
                System.out.println("Comission: " + (total * .07));
                System.out.println("Bonus: 100");
                total += 100;
                total *= 1.07;
                System.out.println("Total: " + total);
            }
            else
            {
                System.out.println("The total amount of sales for floor wax: " + fw);
                System.out.println("The total amount of sales for soap: " + soap);
                System.out.println("The total amount of sales for window cleaner: " + windcleaner);
                System.out.println("Total in sales: " + total);
                System.out.println("Comission: " + (total * .07));
                System.out.println("Bonus: 0");
                total *= 1.07;
                System.out.println("Total: " + total);
            }
        }
        
        if (p == 'r')
        {
            total = fw + soap + windcleaner;
            if (total > 200)
            {
                System.out.println("The total amount of sales for floor wax: " + fw);
                System.out.println("The total amount of sales for soap: " + soap);
                System.out.println("The total amount of sales for window cleaner: " + windcleaner);
                System.out.println("Total in sales: " + total);
                System.out.println("Comission: " + (total * .05));
                System.out.println("Bonus: 100");
                total += 100;
                total *= 1.05;
                System.out.println("Total: " + total);
            }
            else
            {
                System.out.println("The total amount of sales for floor wax: " + fw);
                System.out.println("The total amount of sales for soap: " + soap);
                System.out.println("The total amount of sales for window cleaner: " + windcleaner);
                System.out.println("Total in sales: " + total);
                System.out.println("Comission: " + (total * .05));
                System.out.println("Bonus: 0");
                total *= 1.05;
                System.out.println("Total: " + total);
            }
        }
    }
    
}
