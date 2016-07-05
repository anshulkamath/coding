/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joggingdistance;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class JoggingDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your average stride per minute: ");
        double stride = sc.nextDouble();
        System.out.println("Please enter your total hours then minutes jogged: ");
        int hours = sc.nextInt();
        int mins = sc.nextInt();
        
        double distanceFeet = stride * ((hours * 60) + mins);
        double distance = 5280 / distanceFeet;
        
        System.out.println("You ran " + distance + " miles today.");
    }
    
}
