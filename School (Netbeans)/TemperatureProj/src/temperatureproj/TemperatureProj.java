/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureproj;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class TemperatureProj {

    public static double convertToCelsius (double fahr)
    {
        return (5/9)*(fahr - 32);
    }
    public static double convertToFahr (double cel)
    {
        return (9/5)*(cel + 32);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter what you want to convert to: ");
        String convTo = sc.next();
        if (convTo.toLowerCase().equals("fahrenheit")) 
        {
            System.out.println("Please enter a celsius value to convert to Fahrenheit: ");
            double cel = sc.nextDouble();
            System.out.println(convertToFahr(cel) + " is the Fahrenheit value.");
        }
        else if (convTo.toLowerCase().equals("celsius"))
        {
            System.out.println("Please enter a Fahrenheit value to convert to Celsius: ");
            double fahr = sc.nextDouble();
            System.out.println(convertToCelsius(fahr) + " is the Fahrenheit value.");
        }
    }
    
}
