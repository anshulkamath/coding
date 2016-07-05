/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mowinglawn;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class MowingLawn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width and then the length of your yard in meters: ");
        int ydWdth = sc.nextInt();
        int ydLth = sc.nextInt();
        int ydArea = ydLth * ydWdth;
        
        System.out.println("Please now enter the width and length of your house in meters: ");
        int hsWdth = sc.nextInt();
        int hsLth = sc.nextInt();
        int hsArea = hsWdth * hsLth;
        
        int mowArea = ydArea - hsArea;
        double seconds = (double) mowArea / 2;
        double minutes = seconds / 60;
        System.out.println("It will take " + minutes + " minutes to mow the lawn");
    }
    
}
