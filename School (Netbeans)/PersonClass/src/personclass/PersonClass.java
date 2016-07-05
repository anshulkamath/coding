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
public class PersonClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person Anshul = new Person (150);
        Person Simon = new Person (1);
        
        System.out.println(Simon.intelAmount());
        System.out.println(Anshul.intelAmount());
    }
    
}
