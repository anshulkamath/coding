/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class Golf {
    private static Object Collcetions;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Please enter the par: ");
        int par = sc.nextInt();
        ArrayList<Integer> scores = golf(par);
        
    }
    
    public static ArrayList<Integer> golf(int par)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();
        int[] scores;
        int[] finish = new int[4];
        int a;
        int c = 0;
        int sum = 0;
        int avg;
        int high = 0;
        int low = 0;
        
        while (true)
        {
            System.out.println("Please enter your scores (0 to end)");
            a = sc.nextInt();
            if (a == 0)
            {
                break;
            }
            else
            {
                score.add(a);
            }
            c++;
        }
        
        for (Integer score1 : score) {
            sum += score1;
        }
        avg = (int) ((double) sum / score.size());
        
        System.out.println("The average score is: " + avg);
        System.out.println("The lowest value is: " + score.get(0));
        System.out.println("The highest value is: " + score.get(score.size() - 1));
        
        int parC = par;
        int parF = 0;
        
        for (int rnd : score)
        {
            if (rnd < par)
            {
                parC -= rnd;
            }
            else if (rnd > par)
            {
                parC = rnd - parC;
            }           
            
            if (parC < par)
            {
                parF = par - parC;
            }
            else if (parC > parF)
            {
                parF = parC - par;
            }
            else
            {
                parF = 0;
            }
        }
        
        if (parF > par)
        {
            System.out.println("The total par is " + parF + " over.");
        }
        else if (parF < par && parF != 0)
        {
            System.out.println("The total par is " + parF + " under.");
        }
        else if (parF == 0)
        {
            System.out.println("The total par is 0.");
        }
        
        Collections.sort(score);
        
        return score;
    }
    
}
