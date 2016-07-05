/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.*;
import java.awt.image.*;

/**
 *
 * @author anshulkamath
 */
public class Game extends Canvas implements Runnable
{
    
    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 16 * 9;
    
    private Thread thread;
    private boolean running = false;
    
    public Game()
    {
        new Window (WIDTH, HEIGHT, "Game!", this);
    }
    
    public synchronized void start()
    {
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    
    public synchronized void stop()
    {
        try
        {
            thread.join();
            running = false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                
    }
    
    @Override
    public void run()
    {
       long lastTime = System.nanoTime();
       double amountOfTicks = 60.0;
       double ns = 1000000000 / amountOfTicks;
       double delta = 0;
       long timer = System.currentTimeMillis();
       int frames = 0;
       while (running)
       {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1)
            {
                tick();
                delta--;
            }

            if (running)
            {
                render();
            }

            frames++;

            if (System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
       }
       stop();
    }
    
    private void tick ()
    {
        
    }
    
    private void render ()
    {
        BufferStrategy bs = this.getBufferStrategy();
        
        if (bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }
        
        Graphics g = bs.getDrawGraphics();
        
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        g.dispose();
        bs.show();
        
    }
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        new Game();
    }

    
}
