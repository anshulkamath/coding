/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenums;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class PrimeNums 
{

    public static boolean isPrime (int n)
    {
        boolean a = false;
        int check = 0;
        for (int i = 1; i < n && check != n; i++)
        {
            for (int j = 1; j < n && check != n; j++)
            {
                check = i * j;
                if(check == n)
                {
                    a = false;
                    break;
                }
                else
                    a = true;
            }
        }
        return a;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Please enter a number to determine if prime: ");
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
    
}
