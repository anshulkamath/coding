/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogageconv;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class DogAgeConv 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter the amount of dog years: ");
        int dogYrs = sc.nextInt();
        
        int humanYrs = (int)Math.round(((dogYrs - 1) * (double)16/3) + 13);
        
        System.out.println(dogYrs + " dog years are approximately " + humanYrs + " human years.");
    }
    
}
