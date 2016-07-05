/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninggraphics;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author anshulkamath
 */
public class LearningGraphics 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame window = new JFrame();
        // TODO code application logic here
        window.setSize(640, 480);
        window.setTitle(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        DrawingComponent dc = new DrawingComponent();
        
        window.add(dc);
    }
    
}
