/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reciprocal.squares;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class ReciprocalSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter n.");
        int n = sc.nextInt();
        double total = 0;
        
        for (int i = 1; i < n; i++)
        {
            total += 1.0 / (i * i);
            if ((1.0 / i * i) <= 0.000001 || i >= 100)
                break;
        }
        
        System.out.println("The total: " + Math.sqrt(6. * total));
        System.out.println("Check: " + Math.PI);
    }
    
}
