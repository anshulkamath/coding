/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproject;

/**
 *
 * @author anshulkamath
 */
public class Circle 
{
    private double radius, circumference, diameter;
    
    public Circle (double radius)
    {
        this.radius = radius;
        setCircum(radius);
        setDiameter(radius);
    }
    
    public void setRadius (double rad)
    {
        radius = rad;
    }
    public double getRadius ()
    {
        return this.radius;
    }
    
    public void setCircum (double radius)
    {
        circumference = (2 * Math.PI) * radius;
    }
    public double getCircum ()
    {
        return this.circumference;
    }
    
    public void setDiameter (double radius)
    {
        diameter = 2 * radius;
    }
    public double getDiameter ()
    {
        return this.diameter;
    }
}
