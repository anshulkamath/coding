/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentaverage;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class StudentAverage 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the number of students you have: ");
        int num = sc.nextInt() * 4;
        double avg = 0;
        double total = 0;
        int i = 1;
        int score = 0;
        
        while (i <= num)
        {
            System.out.println("Please enter the grade: ");
            score = sc.nextInt();
            avg += score;
            
            if (i % 4 == 0 && i != 0)
            {
                total += avg/4;
                avg /= 4;
                System.out.println("The average for this student is: " + avg);
                avg = 0;
            }
            
            if (i == num)
                System.out.println("The total class average is: " + total / (num/4));
            
            i++;
        }
    }
    
}
