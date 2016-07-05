/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardclass;

/**
 *
 * @author anshulkamath
 */
public class Card 
{
    private String suit;
    private int value;
    public Card ()
    {
        suit = "NO SUIT";
        value = 0;
    }
    
    public Card (String suit, int value)
    {
        this.suit = suit;
        this.value = value;
    }
    
    public String getSuit ()
    {
        return suit;
    }
    public void setSuit(String suit)
    {
        this.suit = suit;
    }
    
    public int getVal ()
    {
        return value;
    }
    public void setVal (int value)
    {
        this.value = value;
    }
    
}
