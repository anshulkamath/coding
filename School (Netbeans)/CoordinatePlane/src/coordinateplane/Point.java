/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinateplane;

/**
 *
 * @author 19kamatha
 */
public class Point 
{
    private int x;
    private int y;
    
    public Point (int a, int b)
    {
        x = a;
        y = b;
    }
     
    public void setX (int a)
    {
        x = a;
    }
    public int getX ()
    {
        return x;
    }
    
    public void setY (int b)
    {
        y = b;
    }
    public int getY ()
    {
        return y;
    }
}
