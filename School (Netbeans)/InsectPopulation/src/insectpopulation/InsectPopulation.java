/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insectpopulation;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class InsectPopulation {
    
    public static double growthRate (int initial, int post)
    {
        return (double)((double)(post - initial) / initial) + 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please input the initial amount of insects: ");
        int initial = sc.nextInt();
        
        System.out.println("Please enter the amount of insects present after one week.");
        int post = sc.nextInt();
        
        double growthRate = growthRate(initial, post);
        
        System.out.println("The amount of insects at week 2 will be " + (int)(post * growthRate));
    }
    
}
