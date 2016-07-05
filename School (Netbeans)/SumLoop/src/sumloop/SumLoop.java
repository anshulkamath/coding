/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumloop;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class SumLoop {

    public static int addDoWhile (int l, int m)
    {
        int i = 0;
        int sum = 0;
        do
        {
            if (i % m == 0)
            {
               sum += i; 
            }
            if (sum > 1000)
            {
                System.out.println("Breaking! Sum is " + sum);
                break;
            }
            i++;
        }
        while (i <= l);
        return sum;
    }
    public static int addFor (int l, int m)
    {
        int sum = 0;
        for (int i = 0; i <= l; i++)
        {
            if (i % m == 0)
            {
                sum += i;
            }
            if (sum > 1000)
            {
                System.out.println("Breaking! Sum is " + sum);
                break;
            }
        }
        return sum;
    }
    public static int addWhile (int l, int m)
    {
        int i = 0;
        int sum = 0;
        while (i <= l)
        {
            if (i % m == 0)
            {
                sum += i;
            }
            if (sum > 1000)
            {
                System.out.println("Breaking! Sum is " + sum);
                break;
            }
            i++;
        }
        return sum;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter a multiple and a limit: ");
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        System.out.println("Do while loop: " + addDoWhile(l, m));
        System.out.println("For loop: " + addFor(l, m));
        System.out.println("While loop: " + addWhile(l, m));
    }
    
}
