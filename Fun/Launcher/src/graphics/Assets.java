/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.image.*;

/**
 *
 * @author anshulkamath
 */
public class Assets 
{
    
    private static final int WIDTH = 32, HEIGHT = 32;
    
    public static BufferedImage p1, dirt, grass, rock, tree;
    
    public static void init()
    {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
        
        p1 = sheet.crop(0, 0, WIDTH, HEIGHT);
        dirt = sheet.crop(WIDTH, 0, WIDTH, HEIGHT);
        grass = sheet.crop(WIDTH * 2, 0, WIDTH, HEIGHT);
        rock = sheet.crop(WIDTH * 3, 0, WIDTH, HEIGHT);
        tree = sheet.crop(0, HEIGHT * 2, WIDTH, HEIGHT);
    }
}
