/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

import java.awt.Graphics;
import java.awt.image.*;

/**
 *
 * @author anshulkamath
 */
public class Tile 
{
    
    // STATIC STUFF
    
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile rockTile = new RockTile(1);
    public static Tile dirtTile = new DirtTile(2);
    
    
    // CLASS
    
    protected BufferedImage texture;
    protected final int id;
    
    public static final int TILE_WIDTH = 64, TILE_HEIGHT = 64;
    
    public Tile (BufferedImage texture, int id)
    {
        this.texture = texture;
        this.id = id;
        
        tiles[id] = this;
    }
    
    public void tick()
    {
        
    }
    
    public void render(Graphics g, int x, int y)
    {
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }
    
    public boolean isSolid()
    {
        return false;
    }
    
    public int getID()
    {
        return this.id;
    }
}
