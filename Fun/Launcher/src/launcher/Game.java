/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import state.*;
import graphics.*;
import input.KeyManager;
import java.awt.*;
import java.awt.image.*;


/**
 *
 * @author anshulkamath
 */
public class Game implements Runnable
{
    private Display display;
    
    private Thread thread;
    
    private boolean running = false;
    
    private final int width = 640;
    private final int height = width / 16 * 9;
    
    String title;
    
    private BufferStrategy bs;
    private Graphics g;
    
    private KeyManager keyManager;
    
    private GameCamera gameCamera;
    
    
    // States
    private State gameState;
    private State menuState;
    
    public Game (String title)
    {
        this.title = title;
        keyManager = new KeyManager();
        State.setState(gameState);
    }
    
    public void init()
    {
        display = new Display(title);
        display.getFrame().addKeyListener(keyManager);
        Assets.init();
        
        gameCamera = new GameCamera(this, 0, 0);
        
        gameState = new GameState(this);
        menuState = new MenuState(this);
        State.setState(gameState);

    }
    
    public synchronized void start()
    {
        if (running)
            return;
        else
        {
            running = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() 
    {
        init();
        
        int fps = 60;
        double ns = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        long ticks = 0;
        
        while (running)
        {
            now = System.nanoTime();
            delta += (now - lastTime) / ns;
            timer += now - lastTime;
            lastTime = now;
            if (delta >= 1)
            {
                tick();
                render();
                ticks++;
                delta--;
            }
            
            if (timer >= 1000000000)
            {
                System.out.println("Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
        stop();
    }
    
    private void tick()
    {
        keyManager.tick();
        
        if (State.getState() != null)
            State.getState().tick();
    }
    
    private void render()
    {
        bs = display.getCanvas().getBufferStrategy();
        
        if (bs == null)
        {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        
        g = bs.getDrawGraphics();
        
        // Clear screen
        g.clearRect(0, 0, width, height);
        
        // Draw here
        if (State.getState() != null)
            State.getState().render(g);
        
        // End drawing
        bs.show();
        g.dispose();
    }
    
    public synchronized void stop()
    {
        if (!running)
            return;
        else
        {
            running = false;
            try
            {
                thread.join();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public KeyManager getKeyManager()
    {
        return keyManager;
    }
    
    public GameCamera getGameCamera()
    {
        return gameCamera;
    }
}
