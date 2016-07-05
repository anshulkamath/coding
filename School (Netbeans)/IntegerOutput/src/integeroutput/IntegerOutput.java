/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integeroutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class IntegerOutput
{

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws FileNotFoundException 
    {
        File file = new File("fnum1.txt");
        Scanner sc = new Scanner(file);
        // TODO code application logic here
        ArrayList<Integer> all = new ArrayList<Integer>();
        
        int sum = 0;
        int current;
        int i = 0;
        while(sc.hasNext())
        {
            current = sc.nextInt();
            all.add(current);
            if (sum < 32767)
                sum += current;
            else
                break;
            if (i % 9 == 0)
                System.out.println("");
            else
            {
                System.out.print(current + ", ");
            }
            i++;
        }
        
        Collections.sort(all);
        System.out.println("Sum: " + sum);
        System.out.println("Highest number: " + all.get(all.size() - 1));
        System.out.println("Amount of numbers:" + all.size());
        
    }
    
}
