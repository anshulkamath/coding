/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class Fibonacci {
    
//    public static int fibonacci(int n)  
//    {
//        if(n == 0)
//            return 0;
//        else if(n == 1)
//          return 1;
//        else
//          return fibonacci(n - 1) + fibonacci(n - 2);
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Please enter the number you would like to go up to: ");
        int n = sc.nextInt();
        int f1 = 1;
        int f2 = 0;
        int fn = 0;
        for (int i = 0; i < n; i++)
        {
            fn = f1 + f2;
            if (i % 2 == 0)
                f1 = fn;
            else
                f2 = fn;
        }
        System.out.println("The " + n + " number of the Fibonnacci Sequence is " + fn);
    }
    
}
