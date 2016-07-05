/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author anshulkamath
 */
public class ImageLoader 
{
    public static BufferedImage loadImage (String path)
    {
        try
        {
            return ImageIO.read(ImageLoader.class.getResource(path));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
