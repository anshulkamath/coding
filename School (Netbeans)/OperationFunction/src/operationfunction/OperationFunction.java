/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationfunction;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class OperationFunction {

    public static String mathFunc (double num1, double num2, char x)
    {
        double finalResult = 0;
        switch(x)
        {
            case '+': 
            finalResult = num1 + num2;
            break;
            case '-': 
            finalResult = num1 - num2;
            break;
            case '*': 
            finalResult = num1 * num2;
            break;
            case '/': 
            finalResult = num1 / num2;
            break;
            case '%':
            finalResult = num1 % num2;
            break;
            case '^':
            finalResult = Math.pow(num1, num2);
            break;
            default:
            return "ERROR! The operator you input is undefined";            
        }
            
        return "The result of " + num1 + " " + x + " " + num2 + " is " + finalResult;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please input a number 1: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Please input a number 2: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Please input an operator: ");
        char x = sc.next().charAt(0);
        
        System.out.println(mathFunc(num1, num2, x));   
    }   
}