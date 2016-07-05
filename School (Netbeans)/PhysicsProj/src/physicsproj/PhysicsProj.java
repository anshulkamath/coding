/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicsproj;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class PhysicsProj 
{
    
    public static double distFromVel (double vo, double vf, double t)
    {
        return (0.5 * (vo + vf) * t);
    }
    
    public static double distFromAcc (double vo, double t, double a)
    {
        return ((vo * t) + (0.5 * a * (t * t)));
    }
    
    public static double getAccel (double vf, double vo, double t)
    {
        return (vf - vo) / t;
    }
    
    public static double getDist (double vf, double vo, double a)
    {
        return (((vf * vf) - (vo * vo)) / (2 * a));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String voS, vfS, aS, dS, tS;
        Scanner sc = new Scanner (System.in);
        boolean isY = true;
        while (isY)
        {
            double vo = 0; double vf = 0; double a = 0; double d = 0; double t = 0;
            for (int i = 0; i < 3; i++)
            {
                System.out.println("Please enter your original velocity: ");
                voS = sc.next();
                if (voS.equals("?"))
                {
                    i++;
                }
                else
                {
                    vo = Double.valueOf(voS);
                }
                
                System.out.println("Please enter your final velocity: ");
                vfS = sc.next();
                if (vfS.equals("?"))
                {
                    i++;
                }
                else
                {
                    vf = Double.valueOf(vfS);
                }
                
                System.out.println("Please enter the acceleration: ");
                aS = sc.next();
                if (aS.equals("?"))
                {
                    i++;
                }
                else
                {
                    a = Double.valueOf(aS);
                }
                
                System.out.println("Please enter the distance: ");
                dS = sc.next();
                if (dS.equals("?"))
                {
                    i++;
                }
                else
                {
                    d = Double.valueOf(dS);
                }
                
                System.out.println("Please enter the time: ");
                tS = sc.next();
                if (tS.equals("?"))
                {
                    i++;
                }
                else
                {
                    t = Double.valueOf(tS);
                }
                
                if (i == 3)
                {
                    System.out.println("ERROR! Please re-enter all numbers again.");
                    i = 0;
                }
            }
            
            if (d == 0 && t == 0)
            {
                System.out.println(getDist(vf, vo, a));
                System.out.println(((vf - vo) / a)); // Time from acceleration
            }
            
            else if (a == 0 && d == 0)
            {
                a = getAccel(vf, vo, t);
                System.out.println("Acceleration: " + a);
                System.out.println("Distance: " + getDist(vf, vo, a));
            }
            
            else if (vo == 0 && d == 0)
            {
                System.out.println("Original velocity: " + (vf - (a * t)));
                System.out.println("Distance: " + distFromVel(vo, vf, t));
            }
            
            else if (a== 0 && t == 0)
            {
                t = 0.5 * (vo + vf) / d;
                System.out.println("Time: " + t);
                System.out.println("Acceleration: " + getAccel(vf, vo, t));
            }
            
            else if (vo == 0 && vf == 0)
            {
                vo = ((d/t) - (0.5 * a * t));
                System.out.println("Initial velocity: " + vo);
                vf = vo + (a * t);
                System.out.println("Final velocity: " + vf);
            }
            
            else if (vf == 0 && d == 0)
            {
                vf = vo + (a * t);
                System.out.println("Final velocity: " + vf);
                System.out.println("Distance: " + getDist(vf, vo, a));
            }
            
            else if (vo == 0 && a == 0)
            {
                vo = 2 * d - vf * t;
                System.out.println("Original velocity: " + vo);
                System.out.println("Acceleration: " + getAccel(vf, vo, t));
            }
            
            
            System.out.println("Would you like to make another calculation? (y or n)");
            String b = sc.next();
            if (b.equals("n"))
            {
                isY = false;
            }
        }
    }
    
}
