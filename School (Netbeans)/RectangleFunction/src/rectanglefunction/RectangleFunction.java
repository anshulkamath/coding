/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglefunction;

import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class RectangleFunction 
{
    public static boolean checkPoint(int[] p1, int[] p2, int[] p3)
    {
        return p3[0] <= p2[0] && p3[0] >= p1[0] && p3[1] <= p2[1] && p3[1] >= p1[1]; 
    }
    
    public static boolean isParallel(int x1, int x2, int x3, int y1, int y2, int y3)
    {
        return (x1 == x2 || y1 == y2) || (x1 == x3 || y1 == y3);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner (System.in);
       
    }
    
}
