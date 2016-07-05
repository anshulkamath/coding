/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractices;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class ArrayPractices {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumArray();
    }

    public static void sumArray()
    {
        Scanner sc = new Scanner(System.in);
        
        final String SENTINAL = "done";
        String temp;
        int[][] arr = new int[4][5];
        int c = 0;
        int d = 0;
        
        System.out.println("Please enter numbers to fill out a 4x5 table. Type 'done' to exit.");
        
        while(sc.hasNext())
        {
            temp = sc.next();
            
            if (temp.endsWith(SENTINAL))
            {
                for (int i = d; i <= 4; i++) {
                    for (int j = c; j <= 5; j++) {
                        arr[d][c] = 0;
                    }
                }
                break;
            }
            else
                arr[d][c] = Integer.parseInt(temp);
            
            c++;
            c %= 5;
            
            if (c == 0)
                d++;
            
            if (d == 4)
                break;
        }
        
        int[] sums = new int[4];
        int sum = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
            System.out.println("The sum of row " + i + " is: " + sum);
            sum = 0;
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sums[i] = sum;
            sum = 0;
        }
        
        for (int var : sums)
            sum += var;
        
        System.out.println("The sum is: " + sum);
    }
    
    public static void sumArray(double[][] a)
    {
        
    }
    
    public static int[] reverseArray(int[] arr)
    {
        
        
        int[] rev = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        
        return rev;
    }
    
}
