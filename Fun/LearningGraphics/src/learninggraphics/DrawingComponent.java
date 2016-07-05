/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learninggraphics;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author anshulkamath
 */
public class DrawingComponent extends JComponent
{
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle rect1 = new Rectangle(5, 5, 100, 200);
        
        Color c = new Color(125, 50, 250);
        
        g2.setColor(c);
        g2.fill(rect1);
        
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100, 100, 50, 20);
        g2.fill(ellipse1);
        
        Line2D.Double line1 = new Line2D.Double(150, 150, 100, 50);
        g2.draw(line1);
        
        Point2D.Double p1 = new Point2D.Double(200, 200);
        Point2D.Double p2 = new Point2D.Double(500, 200);
        
        Line2D.Double line2 = new Line2D.Double(p1, p2);
        g2.draw(line2);
        
    }
}
