/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.awt.*;
import launcher.*;

/**
 *
 * @author anshulkamath
 */
public abstract class State 
{
    private static State currentState = null;
    protected Game game;
    
    public State (Game game)
    {
        this.game = game;
    }
    
    public static void setState(State state)
    {
        currentState = state;
    }

    public static State getState() 
    {
        return currentState;
    }
    
    // Class
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
    
    
}
