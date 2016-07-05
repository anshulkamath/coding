/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exactbirthday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 19kamatha
 */
public class ExactBirthday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        Date dateobjy = new Date(); //Create 3 new date objects
        Date dateobjm = new Date();
        Date dateobjd = new Date();
        DateFormat date = new SimpleDateFormat("dd"); //Format the month day and year
        DateFormat month = new SimpleDateFormat("MM");
        DateFormat year = new SimpleDateFormat("yyyy");
        String y = year.format(dateobjy); //Put it in a string value
        String m = month.format(dateobjm);
        String d = date.format(dateobjd);
        int intyear = Integer.valueOf(y); //Convert to an integer value
        int intmonth = Integer.valueOf(m);
        int intdate = Integer.valueOf(d);
        
        System.out.println("Enter your birth month number please."); //Get birthday information
        int bmonth = sc.nextInt();
        System.out.println("Enter your birth date please.");
        int bdate = sc.nextInt();
        System.out.println("Enter your birth year please.");
        int byear = sc.nextInt();
        
        int ageyear = intyear - byear; //Do math
        int agemonth = intmonth - bmonth;
        int ageday = intdate - bdate;
        
        System.out.println("You are " + ageyear + " years " + agemonth + " months and " + ageday + "days."); //Return results
    }
    
}
