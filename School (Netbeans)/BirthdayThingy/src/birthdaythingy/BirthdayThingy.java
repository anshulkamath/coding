/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaythingy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class BirthdayThingy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        Calendar cal = Calendar.getInstance();
        int[] birthday = new int[2];
        System.out.print("What year were you born? ");
        birthday[0] = sc.nextInt();
        System.out.print("What is the number of your birth month? ");
        birthday[1] = sc.nextInt();
        double age = 2015 - birthday[0];
        
        age += (9 - birthday[1]) / 12.0;
        System.out.println(age);
        
        if (age < 18){
            System.out.println(firstName + ", you are not over 18!");
        }
        else {
            System.out.println(firstName + "congrats. You are can vote.");
        }
        
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
        
    }
    
}
