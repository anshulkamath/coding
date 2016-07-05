/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunecookie;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class FortuneCookie 
{

    public static int random (int n)
    {
        return (int)(Math.random() * n);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        switch(random(3))
        {
            case 0:
                System.out.println("You will live a long and happy life.");
                break;
            case 1:
                System.out.println("Never use break and continue in the same loop.");
                break;
            case 2:
                System.out.println("Make sure Sanchez is fed at least once every 2 days. (He gets angry when he's hungry)");
                break;
            default:
                break;  
        }
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print(random(99) + " ");
        }
        
        System.out.print("\n");
        
    }
    
}
