/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author anshulkamath
 */
public class BubbleSort {
    
    public static int[] bubbleSort (int[] c)
    {
        int c1, c2, temp, leng;
        leng = c.length;
        
        for (c1 = 0; c1 < (leng - 1); c1++)
        {
            for (c2 = (c1 + 1); c2 < leng; c2++)
            {
                if (c[c2] < c[c1])
                {
                    temp = c[c1];
                    c[c1] = c[c2];
                    c[c2] = temp;
                }
            }
        }
        return c;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] c = new int[100000];
        
        for (int i = 0; i < (c.length - 1); i++)
        {
            c[i] = (int)(Math.random() * 10);
        }
        
        c = bubbleSort(c);
        
        for (int i = 0; i < (c.length - 1); i++)
        {
            System.out.println(c[i]);
        }
     }
    
}
