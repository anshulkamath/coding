/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubes;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class Cubes 
{
    
    public static int addCubes (int n)
    {
        int total = 0;
        for (int i = 0; i <= n; i++)
        {
            total += i*i*i;
        }
        
        return total;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the number you would like to cube: ");
        int n = sc.nextInt();
        
        System.out.println("Your number cubed is: " + addCubes(n));
    }
    
}
