/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunctions;

/**
 *
 * @author 19kamatha
 */
public class MathFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a,b,c,d,e;
        a = 3;
        b = 15;
        c = 2;
        d = Math.max(a, b);
        e = Math.min(a, b);
        
        System.out.println(Math.max(c, d));
        System.out.println(Math.min(c, e));
    }
    
}
