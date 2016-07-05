/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rightangle;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class RightAngle 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the angle of a right triangle (a for alpha b for beta): ");
        char a = sc.next().toLowerCase().charAt(0);
        
        System.out.println("Please enter a side of the triangle (x, y, or z): ");
        char s = sc.next().toLowerCase().charAt(0);
        
        if (a == 'b' && s == 'x')
        {
            System.out.println("Please enter the value of the angle: ");
            double angle = sc.nextDouble();
            
            System.out.println("Please enter the length of the side: ");
            double x = sc.nextDouble();
            
            double alpha = 90 - angle;
            angle *= 0.0174532925;
            double z = Math.tan(angle) / x;
            double y = Math.sin(angle) / x;
            
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Alpha = " + alpha);

            double check = (x * x) + (z * z);
            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
        }
        
        else if (a == 'b' && s == 'y')
        {
            System.out.println("Please enter the value of the angle: ");
            double angle = sc.nextDouble();
            
            System.out.println("Please enter the length of the side: ");
            double y = sc.nextDouble();
            
            double alpha = 90 - angle;
            angle *= 0.0174532925;
            double x = y * Math.sin(angle);
            double z = y * Math.cos(angle);

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Alpha = " + alpha);

            double check = (x * x) + (z * z);
            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
        }
        
        else if (a == 'b' && s == 'z')
        {
            System.out.println("Please enter the value of the angle: ");
            double angle = sc.nextDouble();
            
            System.out.println("Please enter the length of the side: ");
            double z = sc.nextDouble();
            
            double alpha = 90 - angle;
            angle *= 0.0174532925;
            double x = z * Math.tan(angle);
            double y = Math.cos(angle) / z;

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Alpha = " + alpha);

            double check = (x * x) + (z * z);
            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
        }
        
        if (a == 'a' && s == 'x')
        {
            System.out.println("Please enter the value of the angle: ");
            double angle = sc.nextDouble();
            
            System.out.println("Please enter the length of the side: ");
            double x = sc.nextDouble();
            
            double beta = 90 - angle;
            beta *= 0.0174532925;
            double z = Math.tan(beta) / x;
            double y = Math.sin(beta) / x;
            
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Alpha = " + angle);

            double check = (x * x) + (z * z);
            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
        }
        
        else if (a == 'a' && s == 'y')
        {
            System.out.println("Please enter the value of the angle: ");
            double angle = sc.nextDouble();
            
            System.out.println("Please enter the length of the side: ");
            double y = sc.nextDouble();
            
            double beta = 90 - angle;
            beta *= 0.0174532925;
            double x = y * Math.sin(beta);
            double z = y * Math.cos(beta);

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Alpha = " + angle);

            double check = (x * x) + (z * z);
            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
        }
        
        else if (a == 'a' && s == 'z')
        {
            System.out.println("Please enter the value of the angle: ");
            double angle = sc.nextDouble();
            
            System.out.println("Please enter the length of the side: ");
            double z = sc.nextDouble();
            
            double beta = 90 - angle;
            beta *= 0.0174532925;
            double x = z * Math.tan(beta);
            double y = Math.cos(beta) / z;

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Z = " + z);
            System.out.println("Alpha = " + angle);

            double check = (x * x) + (z * z);
            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
        }
        
//        else if (a == 'a' && s == 'x')
//        {
//            System.out.println("Please enter the value of the angle: ");
//            double angle = sc.nextDouble();
//            
//            System.out.println("Please enter the length of the side: ");
//            double x = sc.nextDouble();
//            
//            double beta = 90 - angle;
//            angle *= 0.0174532925;
//            double z = x * Math.tan(angle);
//            double y = Math.cos(angle) / x;
//
//            System.out.println("X = " + x);
//            System.out.println("Y = " + y);
//            System.out.println("Z = " + z);
//            System.out.println("Beta = " + beta);
//
//            double check = (x * x) + (z * z);
//            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
//        }
//        
//        else if (a == 'a' && s == 'y')
//        {
//            System.out.println("Please enter the value of the angle: ");
//            double angle = sc.nextDouble();
//            
//            System.out.println("Please enter the length of the side: ");
//            double y = sc.nextDouble();
//            
//            double beta = 90 - angle;
//            angle *= 0.0174532925;
//            double x = y * Math.sin(angle);
//            double z = y * Math.cos(angle);
//
//            System.out.println("X = " + x);
//            System.out.println("Y = " + y);
//            System.out.println("Z = " + z);
//            System.out.println("Beta = " + beta);
//
//            double check = (x * x) + (z * z);
//            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
//        }
//        
//        else if (a == 'a' && s == 'z')
//        {
//            System.out.println("Please enter the value of the angle: ");
//            double angle = sc.nextDouble();
//            
//            System.out.println("Please enter the length of the side: ");
//            double z = sc.nextDouble();
//            
//            double beta = 90 - angle;
//            angle *= 0.0174532925;
//            
//            double x = z * Math.tan(angle);
//            double y = Math.sin(angle) / z;
//
//            System.out.println("X = " + x);
//            System.out.println("Y = " + y);
//            System.out.println("Z = " + z);
//            System.out.println("Beta = " + beta);
//
//            double check = (x * x) + (z * z);
//            System.out.println("According to the pythagoream theorem, " + y + " should be " + Math.sqrt(check));
//        }
    }
}
