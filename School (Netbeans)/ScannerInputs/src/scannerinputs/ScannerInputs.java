/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinputs;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class ScannerInputs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int e = sc.nextInt();
     int f = a*b*c*d*e;
     double g = a+b+c+d+e;
     
     int largest = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
     int smallest = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
     
     System.out.println(largest);
     System.out.println(smallest);
     System.out.println(f);
     System.out.println(Math.sqrt(g));

    }
    
}
