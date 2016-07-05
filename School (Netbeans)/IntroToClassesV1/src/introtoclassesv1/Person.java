/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoclassesv1;

/**
 *
 * @author anshulkamath
 */
public class Person 
{
    public int height;
    public int weight;
    public int stride;
    
    public Person(int pheight, int pweight, int pstride)
    {
        height = pheight;
        weight = pweight;
        stride = pstride;
    }
    
    public double whR()
    {
        double whR = (double)weight/height;
        return whR;
    }
}
