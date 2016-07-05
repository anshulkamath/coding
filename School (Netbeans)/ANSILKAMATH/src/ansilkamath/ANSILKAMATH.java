/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansilkamath;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class ANSILKAMATH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = s.next();
        if (n.toLowerCase().charAt(0) == 'a') 
        {
            System.out.println("Ansil, get out of here. Right now.");
        } 
        else 
        {
            System.out.println("Ansil, I know it's you. I'm watching you. I know where you live.");
        }
        
    }
    
}
