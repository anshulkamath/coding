/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournament;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class Tournament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the number of team in the tournament.");
        int a = sc.nextInt();
        int c = a;
        int i = 0;
        int sum = 0;
        int b = 0;
        
        do
        {
            c /= 2;
            i++;
            if (c == 1)
                break;
        }
        while (i < a);
        
        System.out.println(i);
        
        for (int j = a; j > 0; j /= 2)
        {
            if (j == a)
                continue;
            sum += j;
        }
        
        System.out.println(sum);
    }
    
}
