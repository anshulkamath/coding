/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treequiz;

/**
 *
 * @author 19kamatha
 */
public class Tree 
{
    private boolean isMaple;
    private int age, percentOfLeaves;
    private double circumference;
    private String colorLeaves;
    
    public Tree ()
    {
        isMaple = true;
        age = 150;
        circumference = 55;
        colorLeaves = "Mixed";
        percentOfLeaves = 40;
    }
    public Tree (boolean b, int a, double circ, String color, int percentage)
    {
        isMaple = b;
        setAge(a);
        circumference = circ;
        setColorOfLeaves(color);
        setPercentage(percentage);
    }
    
    public void setAge (int age)
    {
        this.age = age;
    }
    public void setColorOfLeaves (String color)
    {
        colorLeaves = color;
    }
    public void setPercentage (int percentage)
    {
        if (percentage >= 0 && percentage <= 100)
        {
            percentOfLeaves = percentage;
        }
        else
        {
            System.out.println("Invalid percentage");
        }
        if (percentage == 0)
        {
            colorLeaves = "None";
        }
    }
    
    public boolean getIsMaple ()
    {
        return this.isMaple;
    }
    public int getAge ()
    {
        return this.age;
    }
    public double getCircumference ()
    {
        return this.circumference;
    }
    public String getColorOfLeaves ()
    {
        return this.colorLeaves;
    }
    public int getPercentageOfLeaves ()
    {
        return this.percentOfLeaves;
    }   
}