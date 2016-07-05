/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

import graphics.Assets;

/**
 *
 * @author anshulkamath
 */
public class RockTile extends Tile
{
    
    public RockTile(int id) 
    {
        super(Assets.rock, id);
    }
    
    @Override
    public boolean isSolid()
    {
        return true;
    }
    
}
