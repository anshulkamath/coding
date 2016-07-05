/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author anshulkamath
 */
public class Store 
{
    private String loc, owner;
    private Item[] item = new Item[3];
    private String phn;
    
    public Store ()
    {
        loc = "New York City";
        owner = "Sanchez";
        item [0] = new Item ("Soap", 10, 10);
        item [1] = new Item ("Crackers", 1.99, 2);
        item [2] = new Item ("Oranges", 0.99, 1);
        phn = "18006666666";
    }
    
    public Store (String l, String o, Item i1, Item i2, Item i3, String phnnum)
    {
       loc = l;
       owner = o;
       item [0] = i1;
       item [1] = i2;
       item [2] = i3;
       phn = phnnum;
    }
    
    public String getLoc () 
    {
        return loc;
    }

    public String getOwner ()
    {
        return owner;
    }

    public String getPhn () 
    {
        return phn;
    }
    
    public void setLoc (String loc) 
    {
        this.loc = loc;
    }
    
    public void setOwner (String owner) 
    {
        this.owner = owner;
    }

    public void setPhn (String phn) 
    {
        this.phn = phn;
    }
    
    public void addItem (int i, String desc, double b, double s)
    {
        item [i - 1] = null;
        item [i - 1] = new Item (desc, b, s);
    }
    
    public void removeItem (int i)
    {
        item [i - 1] = null;
    }
}
