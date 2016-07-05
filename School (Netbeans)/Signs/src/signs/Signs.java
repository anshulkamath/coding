/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signs;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class Signs 
{
    public static void sign()
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("What pattern would you like to make?");
            char c = sc.next().toLowerCase().charAt(0);

            int temp;
            int count;
            
            switch (c)
            {
                case 'a':
                {
                    temp = 0;
                    for (int i = 0; i < 10; i++)
                    {
                        count = 0;
                        for (int j = 0; j < 10; j++)
                        {
                            if (count <= temp)
                            {
                                System.out.print("*");
                                count++;
                                continue;
                            }
                            System.out.print(" ");
                        }
                    temp++;
                    System.out.print("\n");
                    }
                    break;
                }
                case 'b':
                {
                    temp = 9;
                    for (int i = 10; i > 0; i--)
                    {
                        count = 0;
                        for (int j = 10; j > 0; j--)
                        {
                            if (count <= temp)
                            {
                                System.out.print("*");
                                count++;
                                continue;
                            }
                            System.out.print(" ");
                        }
                        temp--;
                        System.out.print("\n");
                    }
                    break;
                }
                case 'c':
                {
                    temp = 0;
                    for (int i = 0; i <= 10; i++)
                    {
                        count = 0;
                        for (int j = 0; j < 10; j++)
                        {
                            if (count < temp)
                            {
                                System.out.print(" ");
                                count++;
                                continue;
                            }
                            System.out.print("*");
                        }
                    temp++;
                    System.out.print("\n");
                    }
                    break;
                }
                case 'd':
                {
                    temp = 8;
                    for (int i = 10; i > 0; i--)
                    {
                        count = 0;
                        for (int j = 10; j > 0; j--)
                        {
                            if (count <= temp)
                            {
                                System.out.print(" ");
                                count++;
                                continue;
                            }
                            System.out.print("*");
                        }
                        temp--;
                        System.out.print("\n");
                    }
                    break;
                }
                default:
                {
                    System.out.println("That is an invalid number. Please enter a different letter.");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        sign();
    }
    
}
