/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionintro;

import java.util.Scanner;


/**
 *
 * @author 19kamatha
 */
public class FunctionIntro 
{

    public static double runSpeed(double height, double weight, int stride)
    {
        double a = weight / height;
        double speed = a * stride;
        return speed;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter your height in inches.");
        double height = sc.nextDouble();
        System.out.println("Please enter your weight in pounds.");
        double weight = sc.nextDouble();
        System.out.println("Please enter your stride length in feet.");
        int stride = sc.nextInt();
        
        double speed = runSpeed(height, weight, stride);
        System.out.println("Your maxium speed is " + speed + " mph");
    }
    
}
