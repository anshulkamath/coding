/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.manipulation;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int countUp = 0;
        int countNum = 0;
        
        Scanner sc = new Scanner (System.in);
        String string = sc.next();
        
        int len = string.length();
        String vowels = "aeiou";
        
        boolean vowel = true;
        if (string.startsWith(vowels)) 
        {
             vowel = true;
        }
        
        for (char c: string.toCharArray()) 
        {
            if (Character.isDigit(c))
            {
                countNum++;
            }
            else if (Character.isUpperCase(c))
            {
                countUp++;
            }
        }
        System.out.println(string);
        System.out.println(len);
        System.out.println("Does the string start with a vowel? " + vowel);
        System.out.println("There are " + countUp + " upper case letters in the string");
        System.out.println("There are " + countNum + " numbers in the string");
    }
    
}
