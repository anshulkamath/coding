/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author anshulkamath
 */
public class Display extends Canvas 
{
    private JFrame window;
    private Canvas canvas;
    
    String title;
    private final int WIDTH = 640;
    private final int HEIGHT = WIDTH / 16 * 9;

    public Canvas getCanvas () {
        return canvas;
    }

    public void setCanvas (Canvas canvas) {
        this.canvas = canvas;
    }
    
    public JFrame getFrame ()
    {
        return window;
    }
    
    public Display (String title)
    {
        window = new JFrame();
        window.setSize(new Dimension(WIDTH, HEIGHT));
        window.setTitle(title);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        canvas.setFocusable(false);
        
        window.add(canvas);
        window.pack();
    }
}
