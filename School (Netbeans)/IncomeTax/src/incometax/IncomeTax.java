/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your gross salary: ");
        double income = sc.nextDouble();
        
        System.out.println("Please enter the number of dependants: ");
        int dependants = sc.nextInt();
        
        double tax = ((income * .2) - 1000) - (2000 * dependants);
        
        System.out.println("Your tax value is " + tax);
    }
    
}
