/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double a;
        int b,c,d;
        a = Math.random();
        b = (int)(a * 10);
        System.out.println(b);
        
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        d = b * c;
        
        System.out.println(d);
        
    }
    
}
