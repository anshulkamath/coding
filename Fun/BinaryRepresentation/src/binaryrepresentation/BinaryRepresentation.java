/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryrepresentation;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class BinaryRepresentation 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        Boolean[] binary = new Boolean[8];
        int temp;
        
        System.out.println("Please enter a number (less than 32,700): ");
        double binDoub = sc.nextDouble();
        
        double bin = Double.parseDouble(Double.toHexString(binDoub));
        
        int binInt = (int)binDoub;
        
        temp = Integer.parseInt(Integer.toBinaryString(binInt));
        
        System.out.println(bin);
        System.out.println(temp);
    }
    
}
