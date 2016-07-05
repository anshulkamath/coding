/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproject;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class MathProject 
{
    
    public static void greaterDouble (double b, double b2)
    {
        if (b > b2)
        {
            System.out.println(b + " is the greater double.");
        }
        else if (b2 > b)
        {
            System.out.println(b2 + " is the greater double.");
        }
        else
        {
            System.out.println("The doubles are equal.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter in an int and then a double: ");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        boolean isAOdd = false;
        boolean isBOdd = false;
        
        if ((a % 2) == 0)
        {
            isAOdd = false;
        }
        else
        {
            isAOdd = true;
        }
        
        if ((b % 2) == 0)
        {
            isBOdd = false;
        }
        else
        {
            isBOdd = true;
        }
        
        System.out.println("Square root of " + a + ": " + Math.sqrt((double) a));
        System.out.println("Power of " + a + ": " + Math.pow((double)a, 3));
        System.out.println("Absolute Value of " + a + ": " + Math.abs((double) a));
        System.out.println("Is " + a + " odd? " + isAOdd);
        System.out.println("Power of " + a + ": " + (a * a));
        
        System.out.println(" ");
        
        System.out.println("Square root of " + b + ": " + Math.sqrt(b));
        System.out.println("Power of " + b + ": " + Math.pow(b, 3));
        System.out.println("Absolute Value of " + b + ": " + Math.abs(b));
        System.out.println("Is " + b + " odd? " + isBOdd);
        System.out.println("Power of " + b + ": " + (b * b));
        System.out.println(" ");
        
        System.out.println("Please enter another int and double: ");
        int a2 = sc.nextInt();
        double b2 = sc.nextDouble();
        System.out.println(" ");
        
        greaterDouble(b, b2);
        System.out.println(" ");
        
        System.out.println(a + " + " + a2 + " = " + (a + a2));
        System.out.println(b + " + " + b2 + " = " + (b + b2));
        System.out.println(" ");
        
        System.out.println(a + " * " + a2 + " = " + (a * a2));
        System.out.println(b + " * " + b2 + " = " + (b * b2));
        System.out.println(" ");
        
        System.out.println(a + " - " + a2 + " = " + (a - a2));
        System.out.println(b + " - " + b2 + " = " + (b - b2));
        System.out.println(" ");
        
        System.out.println(a + " / " + a2 + " = " + ((double)a / a2));
        System.out.println(b + " / " + b2 + " = " + (b / b2));
        System.out.println(" ");
        
        System.out.println("Please enter the length of a leg for a right triangle: ");
        double leg1 = sc.nextDouble();
        System.out.println("Please enter the length of another leg of the right triangle: ");
        double leg2 = sc.nextDouble();
        double hypsq = (leg1 * leg1) + (leg2 * leg2);
        System.out.println("The hypotenuse is: " + Math.sqrt(hypsq));
        
        System.out.println("Please input a value for the radius of the circle: ");
        double radius = sc.nextDouble();
        
        Circle c = new Circle(radius);
        System.out.println("The radius of the circle is " + c.getRadius());
        System.out.println("The diameter of the circle is " + c.getDiameter());
        System.out.println("The circumference of the circle is " + c.getCircum());
        
        System.out.println("Please enter the angle of a right triangle: ");
        double beta = sc.nextInt();
        beta = beta * 0.0174532925;
        
        System.out.println("Please enter the length of the opposite side: ");
        int z = sc.nextInt();
        
        double x = z / Math.tan(beta);
        double y = z / Math.sin(beta);
        
        double alpha = 90 - beta;
        
        double check = (x * x) + (z * z);
        System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
    }
    
}
