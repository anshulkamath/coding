/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterfunctions;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class CharacterFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char[] characters = new char[5];
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Please input a character: ");
            characters[i] = sc.next().charAt(0);
        }
        
        int ascii = 0;
        
        for(int i = 0; i < 5; i++)
        {
            ascii += characters[i];
        }
        
        int lastChar = characters[4];
        
        System.out.println("The total ASCII value is " + ascii);
        System.out.println("The last ASCII value is " + lastChar);
        
    }
    
}
