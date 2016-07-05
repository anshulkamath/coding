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
public class DynamicPoints 
{
    private Point p1, p2;
    private double slope;
    public DynamicPoints (Point a, Point b)
    {
        p1 = a;
        p2 = b;
        slope = generateSlope();
    }
    public void setX(Point x)
    {
        p1 = x;
    }
    public void setY(Point y)
    {
        p2 = y;
    }
    public double generateSlope()
    {
        return (double)(Math.random() * 10);
    }
    public boolean isIntersecting()
    {
        
        double checkX1 = p1.getX() * slope;
        double checkX2 = p2.getX() * slope;
        
        return !(checkX1 > p1.getX() && checkX1 > p2.getX() || checkX1 < p1.getX() && checkX1 < p2.getX());

        

    }
}
