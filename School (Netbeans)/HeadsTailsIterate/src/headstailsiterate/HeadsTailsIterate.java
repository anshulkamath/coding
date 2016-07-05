/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headstailsiterate;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class HeadsTailsIterate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter a phrase: ");
        String a = sc.next();
        
        int h = 0;
        int t = 0;
        int i = 0;
        
        do
        {
            if (a.charAt(i) == 'h')
                h++;
            else if (a.charAt(i) == 't')
                t++;
            else if (a.charAt(i) == '.')
                break;
            i++;
        }
        while (i < a.length());
        
        if ((double) t/h == 0)
            System.out.println("All heads");
        else if ((double) h/t == 0)
            System.out.println("All tails");
        else
            System.out.println("The ratio of heads to tails is: " + (double) h/t);
    }
    
}
