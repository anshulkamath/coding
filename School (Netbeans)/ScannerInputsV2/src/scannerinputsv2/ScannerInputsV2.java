/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinputsv2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class ScannerInputsV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {    
            Scanner sc = new Scanner (System.in);
            int number = 0;
            int counter = sc.nextInt();
            int[] array = new int[counter];
        
            while (number < counter)
            {
                array[number] = sc.nextInt();
                number++;
            }
            Arrays.sort(array);
            System.out.println("The maximum value in this array is " + array[array.length - 1]);
            System.out.println("The minimum value in this array is " + array[0]);
        }
        catch (Exception e)
        {
            System.out.println("Build failed because " + e.getMessage());
        }
    }
    
}
