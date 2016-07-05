/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answerchecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author anshulkamath
 */
public class AnswerChecker 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("answer.txt"));
        PrintWriter pw = new PrintWriter(new File("results.txt"));
        // TODO code application logic here
        String answers = "";
        ArrayList<Integer> ID = new ArrayList<>();
        ArrayList<String> response = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        String temp;
        int c = 0;
        int sum = 0;
        
        while (sc.hasNext())
            answers += sc.next();
        
        // Re-instantiating Scanner
        sc.close();
        sc = new Scanner(new File("input.txt"));
        
        while (sc.hasNext())
        {
            ID.add(sc.nextInt());
            response.add(sc.next());
        }
        
        // Re-instanciating Scanner
        sc.close();
        sc = new Scanner(System.in);
        
        System.out.print("Would you like to add another student? (y or n): ");
        while (sc.next().charAt(0) == 'y')
        {
            System.out.print("What is the student ID? ");
            int IDN = sc.nextInt();
            if (ID.contains(IDN))
                System.out.print("This is student already has a response!");
            else
            {
                ID.add(IDN);

                System.out.print("Please enter the answers for the student: ");
                response.add(sc.next());
            }
            
            System.out.print("Would you like to add another student? (y or n)");
        }
        
        for (int i = 0; i < ID.size(); i++) 
        {
            temp = response.get(i);
            for (int j = 0; j < 3; j++) 
            {
                if (temp.charAt(j) == answers.charAt(j))
                    c++;
            }
            result.add(c);
            sum += c;
            c = 0;
        }
        
        for (int i = 0; i < ID.size(); i++) 
            pw.println(ID.get(i) + " " + result.get(i));
        
        pw.close();
        sc.close();
        
        System.out.println("There are " + ID.size() + " students that have submitted answers.");
        System.out.println("The average amount of correct asnwers are " + ((double) sum) / (ID.size() * 3));
    }
    
}
