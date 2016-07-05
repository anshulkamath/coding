/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidaysproj;

import java.util.Scanner;

/**
 *
 * @author anshulkamath
 */
public class HolidaysProj 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Please enter a year: ");
        int d = sc.nextInt();
        
        int labor = 0;
        for (int i = 1; i < 8; i++)
        {
            if (Weekday.DayOfWeek(9, i, d) == 1)
            {
                labor = i;
                System.out.println("Labor day is on the " + labor + " of September in the year of " + d);
            }
        }
        
        int memorial = 0;
        for (int i = 24; i < 31; i++)
        {
            if (Weekday.DayOfWeek(5, i, d) == 1)
            {
                memorial = i;
                System.out.println("Memorial day is on the " + memorial + " of May in the year of " + d);
            }
        }
        
        int thanksgiving = 0;
        for (int i = 22; i < 28; i++)
        {
            if (Weekday.DayOfWeek(11, i, d) == 4)
            {
                thanksgiving = i;
                System.out.println("Thanksgiving is on the " + thanksgiving + " of November in the year of " + d);
            }
        }
        
        int election = 0;
        for (int i = 2; i < 9; i++)
        {
            if (Weekday.DayOfWeek(11, i, d) == 2)
            {
                election = i;
                System.out.println("Election day is on the " + election + " of November in the year of " + d);
            }
        }
    }
    
}
