/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.creature;

import graphics.Assets;
import java.awt.*;
import launcher.*;

/**
 *
 * @author anshulkamath
 */
public class Player extends Creature
{
    public Player(Game game, float x, float y) 
    {
        super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
    }

    @Override
    public void tick() 
    {
        getInput();
        move();
        game.getGameCamera().centerOnEntity(this);
    }

    @Override
    public void render(Graphics g) 
    {
        g.drawImage(Assets.p1, 
                (int) (x - game.getGameCamera().getxOffset()), 
                (int) (y - game.getGameCamera().getyOffset()), 
                width, 
                height, 
                null);
        move();
    }
    
    public void getInput()
    {
        xMove = 0;
        yMove = 0;
        
        if (game.getKeyManager().up)
            yMove = -speed;
        
        if (game.getKeyManager().down)
            yMove = speed;
        
        if (game.getKeyManager().left)
            xMove = -speed;
        
        if (game.getKeyManager().right)
            xMove = speed;
    }

    
}
