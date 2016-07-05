/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclass2.pkg0;

import java.util.Arrays;

/**
 *
 * @author 19kamatha
 */
public class PersonClass20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Person simon = new Person();
        Person anshul = new Person(150, 70, 14, "Anshul", "Black", "Brown", true, 2001, 6, 24);
        
        Person[] pers = new Person[2];
        pers[0] = simon;
        pers[1] = anshul;
        
        int[] height = new int[2];
        height[0] = simon.getHeight();
        height[1] = anshul.getHeight();
        
        Arrays.sort(height);
    }
    
}
