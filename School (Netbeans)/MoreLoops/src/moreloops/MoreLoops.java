/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreloops;

import java.util.ArrayList;

/**
 *
 * @author anshulkamath
 */
public class MoreLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<Double> sqrts = new ArrayList<>();
        for (double i = 25; i > 0; i -= 5)
        {
            sqrts.add(Math.sqrt(i));
        }
        for (Double i : sqrts)
        {
            System.out.println(i);
        }
        
        
        int sum = 0;
        int add = 1;
        while(sum <= 1000000)
        {
            sum += add;
            add++;
        }
        
        System.out.println(add);
        
    }
    
}
