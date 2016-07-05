/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chars;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class Chars 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char[] characters = new char [5];
        int sum = 0;
        String str = new String();
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Please input a character to the console: ");
            characters[i] = sc.next().charAt(0);
            sum += characters[i];
            str += characters[i] + " ";
        }
        int lastVal = characters[characters.length - 1];
        System.out.println(str);
        System.out.println("The ASCII values combined is " + sum);
        System.out.println("The last ASCII value in the array is " + lastVal);
    }
}
