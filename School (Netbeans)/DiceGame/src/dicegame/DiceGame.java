/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author anshulkamath
 */
public class DiceGame 
{
    public static int roll () {
        int die1 = ((int)(Math.random() * 6)) + 1;
        int die2 = ((int)(Math.random() * 6)) + 1;
        
        return die1 + die2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int[] roll1 = new int[13];
        int[] roll2 = new int[13];
        for (int i = 0; i < 1000000000; i++)
        {
            roll1[roll()]++;
        }
        for (int i = 0; i < roll1.length; i++)
        {
            System.out.println(i + " " + roll1[i]);
        }
        
        System.out.println(" ");
        
        Map<Integer, Integer> sortedRoll = new TreeMap();
        for (int i = 0; i < roll1.length; i++)
        {
            sortedRoll.put(roll1[i], i);
        }
        
        for (Map.Entry<Integer, Integer> entry: sortedRoll.entrySet())
        {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
    
    
}
