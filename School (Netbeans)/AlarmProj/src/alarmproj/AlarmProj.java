/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmproj;

/**
 *
 * @author 19kamatha
 */
public class AlarmProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Alarm a = new Alarm(4, 30, 20, false);
        a.setIsMilitary(true);
    }
    
}
