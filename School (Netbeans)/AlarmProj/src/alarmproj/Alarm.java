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
public class Alarm
{
    private int hours, mins, secs;
    private boolean isMilitary;
    public Alarm()
    {
        hours = 12;
        mins = 0;
        secs = 0;
        isMilitary = false;
    }
    public Alarm(int h, int m, int s, boolean b)
    {
        hours = h;
        mins = m;
        secs = s;
        isMilitary = b;
    }
    
    public void setIsMilitary(boolean b)
    {
        isMilitary = b;
    }
    public void setH(int h)
    {
        hours = h;
    }
    public void setM(int m)
    {
        mins = m;
    }
    public void setS(int s)
    {
        secs = s;
    }
    
    public boolean getIsMilitary()
    {
        boolean b = isMilitary;
        return b;
    }
    public int getH()
    {
        int h = hours;
        return h;
    }
    public int getM()
    {
        int m = mins;
        return m;
    }
    public int getS()
    {
        int s = secs;
        return s;
    }
}
