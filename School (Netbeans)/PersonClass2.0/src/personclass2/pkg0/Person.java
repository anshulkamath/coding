/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass2.pkg0;

import java.util.Calendar;

/**
 *
 * @author 19kamatha
 */
public class Person 
{
    private int wt, ht, age;
    private String name, hairColor, eyeColor;
    private Calendar dob;
    private boolean isMale;
    
    public Person()
    {
        dob = Calendar.getInstance();
        dob.set(1995, 6, 15);
        wt = 200;
        ht = 65;
        age = 20;
        name = "Richard";
        hairColor = "red";
        eyeColor = "Brown";
        isMale = true;
    }
    
    public Person(int weight, int height, int age, String name, String hairColor, String eyeColor, boolean isMale, int year, int month, int day)
    {
        this.wt = weight;
        this.setHeight(height);
        this.age = age;
        this.name = name;
        this.hairColor = hairColor;
        this.setEyeColor(eyeColor);
        this.isMale = isMale;
        this.setBirthday(year, month, day);
    }
    
    
    public void setEyeColor (String e)
    {
        String eye = e.toLowerCase();
        switch (eye)
        {
            case "blue":
                this.eyeColor = "Blue";
                break;
            case "green":
                this.eyeColor = "Green";
                break;
            case "brown":
                this.eyeColor = "Brown";
                break;
            default:
                System.out.println("Eye color is not valid");
                break;
        }
    }
    public String getEyeColor()
    {
        return this.eyeColor;
    }
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    
    public void setGender(boolean isMale)
    {
        this.isMale = isMale;
    }
    public boolean getGender()
    {
        return this.isMale;
    }
    
    
    public void setHeight(int height)
    {
        if(height < 75 && height > 40)
        {
            this.ht = height;
        }
        else
        {
            System.out.println("Height is invalid.");
        }
    }
    public int getHeight()
    {
        return this.ht;
    }
    
    
    public void setWeight(int weight)
    {
        this.wt = weight;
    }
    public int getWeight()
    {
        return this.wt;
    }
    
    
    public void setBirthday(int year, int month, int day)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        if(cal.get(year) > Calendar.YEAR)
        {
            System.out.println("This is an invalid date.");
        }
        else
        {
            this.dob = cal;
        }
    }
    public Calendar getBirthday()
    {
        return this.dob;
    }
    
    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
    public String getHairColor()
    {
        return this.hairColor;
    }
}
