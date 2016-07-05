/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datefunctions;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author 19kamatha
 */
public class DateFunctions 
{
    public static int dateConvert(int day, int month, int year)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        Calendar base = Calendar.getInstance();
        base.set(-4714, 0, 1);
        
        long start = base.getTimeInMillis();
        long end = cal.getTimeInMillis();
        
        long milli = end - start;
        
        int jDate = (int) TimeUnit.MILLISECONDS.toDays(Math.abs(milli));
        
        return jDate;
    }
    
    public static int[] dateFromJulian (int julianDate)
    {
        Calendar base = Calendar.getInstance();
        base.set(-4714, 0 ,1);
        base.add(Calendar.DATE, julianDate);
        int[] array = new int[3];
        array[0] = base.get(Calendar.DATE) + 1;
        array[1] = base.get(Calendar.MONTH) + 1;
        array[2] = base.get(Calendar.YEAR);
        
        return array;
    }
    
    public static int daysBtwn(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        return Math.abs(dateConvert(day1, month1, year1) - dateConvert(day2, month2, year2));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the date (ex. 7).");
        int day = sc.nextInt();
        System.out.println("Please input the month (ex. 4).");
        int month = sc.nextInt() - 1;
        System.out.println("Please input the year (ex. 2001).");
        int year = sc.nextInt();
        System.out.println(dateFromJulian(dateConvert(day, month, year))[0]);
        System.out.println(dateFromJulian(dateConvert(day, month, year))[1]);
        System.out.println(dateFromJulian(dateConvert(day, month, year))[2]);
    }
    
}
