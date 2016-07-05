/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class Factorial {
    
    public static int factorial (int n)
    {
        if (n == 1)
            n =1;
        else
            n *= factorial(n-1);
        return n;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the number you would like to factorial: ");
        int n = sc.nextInt();
        
        System.out.println(n + "'s factorial is " + factorial(n));
    }
    
}
