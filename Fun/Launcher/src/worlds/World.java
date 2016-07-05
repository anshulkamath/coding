/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worlds;

import java.awt.Graphics;
import tile.Tile;
import launcher.*;

/**
 *
 * @author anshulkamath
 */
public class World 
{
    private Game game;
    private int width, height;
    private int[][] tiles;
    
    private int spawnX, spawnY;
    
    public World(Game game, String path)
    {
        this.game = game;
        loadWorld(path);
    }
    
    public void tick()
    {
        
    }
    
    public void render(Graphics g)
    {
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                getTile(x, y).render(g, 
                        (int)(x * Tile.TILE_WIDTH - game.getGameCamera().getxOffset()), 
                        (int)(y * Tile.TILE_HEIGHT - game.getGameCamera().getyOffset()));
            }
        }
    }
    
    public Tile getTile(int x, int y)
    {
        Tile t = Tile.tiles[tiles[x][y]];
        if (t == null)
            return Tile.dirtTile;
        return t;
    }
    
    private void loadWorld(String path)
    {
        String file = Utility.loadFileFromString(path);
        String[] tokens = file.split("\\s+");
        width = Utility.parseInt(tokens[0]);
        height = Utility.parseInt(tokens[1]);
        
        spawnX = Utility.parseInt(tokens[2]);
        spawnY = Utility.parseInt(tokens[3]);
        
        tiles = new int[width][height];
        
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                tiles[x][y] = Utility.parseInt(tokens[(x + y * width) + 4]);
            }
        }
    }
}
