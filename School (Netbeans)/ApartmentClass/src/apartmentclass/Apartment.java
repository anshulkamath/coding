/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartmentclass;

/**
 *
 * @author 19kamatha
 */
public class Apartment 
{
    private String location;
    private int roomNum, occNum, floorNum;
    private double rentpm;
    private boolean hasPets, hasAC, inCity;
    
    public Apartment ()
    {
        this.location = "New York City";
        this.roomNum = 1;
        this.floorNum = 13;
        this.occNum = 1;
        this.hasPets = true;
        this.rentpm = 1000;
        this.hasAC = false;
        this.inCity = true;
    }
    
    public Apartment (String location, int roomNum, int floorNum, int occNum, boolean hasPets, boolean hasAC, boolean inCity)
    {
        this.location = location;
        setRooms(roomNum);
        this.floorNum = floorNum;
        setOccupants(occNum);
        this.hasPets = hasPets;
        this.hasAC = hasAC;
        this.inCity = inCity;
        calcRent(roomNum, floorNum, occNum, hasPets, hasAC, inCity);
    }
    
    public Apartment (int occNum, boolean hasPets, boolean hasAC)
    {
        this.location = "California";
        setRooms(4);
        this.floorNum = 1;
        setOccupants(2);
        this.hasPets = true;
        this.hasAC = true;
        this.inCity = true;
        calcRent(this.roomNum, this.floorNum, this.occNum, this.hasPets, this.hasAC, this.inCity);
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    public String getLocation ()
    {
        return this.location;
    }
    
    public void setRooms (int roomNum)
    {
        if (1 < roomNum && roomNum < 5)
        {
            this.roomNum = roomNum;
        }
        else
        {
            System.out.println("Amount of rooms invalid.");
            this.roomNum = 0;
        }
    }
    public int getRooms ()
    {
        return this.roomNum;
    }
    
    public void setFloor (int floorNum)
    {
        this.floorNum = floorNum;
    }
    public int getFloor ()
    {
        return this.floorNum;
    }
    
    public void setOccupants (int occNum)
            
    {
        if(1 <= occNum && occNum <= 10)
        {
            this.occNum = occNum;
        }
        else
        {
            System.out.println("Amount of occupants invalid.");
            this.occNum = 0;
        }
    }
    public int getOccupants ()
    {
        return this.occNum;
    }
    
    public void setHasPets (boolean hasPets)
    {
        this.hasPets = hasPets;
    }
    public boolean getHasPets ()
    {
        return this.hasPets;
    }
    
    public void setHasAc (boolean hasAC)
    {
        this.hasAC = hasAC;
    }
    public boolean getHasAC ()
    {
        return this.hasAC;
    }
    
    public void setInCity (boolean inCity)
    {
        this.inCity = inCity;
    }
    public boolean getInCity ()
    {
        return this.inCity;
    }
    
    public double calcRent (int roomNum, int floorNum, int occNum, boolean hasPets, boolean hasAC, boolean inCity)
    {
        this.rentpm = (occNum * floorNum) * roomNum;
        if (hasPets)
        {
            this.rentpm = this.rentpm * 1.5;
        }
        if (hasAC)
        {
            this.rentpm = this.rentpm + 200;
        }
        else
        {
            this.rentpm = this.rentpm - 100;
        }
        if (inCity)
        {
            this.rentpm = this.rentpm * 2;
        }
        
        return this.rentpm;
    }
}
