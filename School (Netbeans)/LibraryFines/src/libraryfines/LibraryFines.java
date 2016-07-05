/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryfines;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 19kamatha
 */
public class LibraryFines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String firstName = JOptionPane.showInputDialog("Please enter your first name.");
        String middleName = JOptionPane.showInputDialog("Please enter your middle name.");
        String lastName = JOptionPane.showInputDialog("Please enter your last name.");
        
        String fullName = firstName + " " + middleName + " " + lastName;
        
        double[] fines = new double[10];
        int sum = 0; 
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Please input your fine for book #" + (i + 1) + " into the console");
            fines[i] = sc.nextDouble();
            sum += fines[i];
        }
        
        Arrays.sort(fines);
        
        System.out.println(fullName + ", you have $" + sum + " due to the library");
        System.out.println("The highest fine due is " + fines[fines.length - 1]);
        System.out.println("The lowest fine due is " + fines[0]);
        
    }
    
}
