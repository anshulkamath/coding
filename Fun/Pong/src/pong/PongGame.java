/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author anshulkamath
 */
public class PongGame extends JComponent implements ActionListener, MouseMotionListener
{
    
    private int ballX = ((int) (Math.random() * 1000)) % 1000;
    private int ballY = 150;
    private int paddleX = 0;
    private int ballYSpeed = 10;
    private int ballXSpeed = 5;
    private int x = 800;
    private int y = 600;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("Pong");
        PongGame game = new PongGame();
        window.add(game);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        
        Timer t = new Timer(40, game);
        t.start();
        
        window.addMouseMotionListener(game);
        
        Container c = window.getContentPane();
        c.setBackground(new Color (157, 234, 252));
    }
    
    public Dimension getPreferredSize ()
    {
        return new Dimension(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
        // Paddle 1
        g.setColor(new Color (114, 60, 94));
        g.fillRect(paddleX, 510, 150, 15);
        
        // Ball
        g.setColor(new Color (114, 60, 94));
        g.fillOval(ballX, ballY, 30, 30);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        ballX += ballXSpeed;
        ballY += ballYSpeed;
        
        if (ballY >= 600)
        {
            
        }
        
        if (ballY == 480 && ballX >= paddleX && ballX <= paddleX + 150)
            ballYSpeed = -10;
        
        else if (ballY <= 0)
            ballYSpeed = 10;
        
        if (ballX >= 770)
            ballXSpeed = -5;
        
        else if (ballX <= 30)
            ballXSpeed = 5;
        
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        if (e.getXOnScreen() - 75 <= 0)
            paddleX = 0;
        else
           paddleX = e.getX() - 75; 
        repaint();
    }
}
