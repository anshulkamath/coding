/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import entity.creature.Player;
import graphics.Assets;
import java.awt.Graphics;
import launcher.*;
import tile.*;
import worlds.World;

/**
 *
 * @author anshulkamath
 */
public class GameState extends State
{
    
    private Player player;
    private World world;

    public GameState(Game game)
    {
        super (game);
        player = new Player(game, 100, 100);
        world = new World(game, "res/worlds/world1.txt");
        
        game.getGameCamera().move(0, 0);
    }
    
    @Override
    public void tick() 
    {
        world.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) 
    {
        world.render(g);
        player.render(g);
    }
    
}
