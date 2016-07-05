/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalc;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class BMICalc 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter your height in inches: ");
        int height = sc.nextInt();
        
        System.out.println("Please enter your weight in pounds: ");
        int weight = sc.nextInt();
        
        double htMtrs = (double)(height * 0.0254);
        double wtKgs = (double)(weight * .454);
        
        System.out.println("Your BMI is " + (wtKgs / (htMtrs * htMtrs)));
    }
    
}
