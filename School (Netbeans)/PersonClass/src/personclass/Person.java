/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass;

/**
 *
 * @author 19kamatha
 */
public class Person {
    
    int pIQ;
    
    public Person (int intelligence)
    {
        pIQ = intelligence;
    }
    
    public String intelAmount()
    {
       String msg = new String();
       if (pIQ < 0)
       {
           msg = "...";
       }
       else if (0 < pIQ && pIQ < 50)
       {
           msg = "You are a Simon. God is with you but we are not.";
       }
       else if (50 < pIQ && pIQ < 90)
       {
           msg = "You need help";
       }
       else if (90 < pIQ && pIQ < 110)
       {
           msg = "A'ight you're smart";
       }
       else if (110 < pIQ)
       {
           msg = "You're a freakin' Anshul! Congrats";
       }
       return msg;
    }
}
