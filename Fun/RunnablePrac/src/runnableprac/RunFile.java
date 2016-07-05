/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnableprac;


/**
 *
 * @author anshulkamath
 */
public class RunFile implements Runnable
{
    
    private boolean running = false;
    
    private Thread thread;
    
    private final int width = 640;
    private final int height = width / 16 * 9;
    
    String title;
    
    public RunFile (String title)
    {
        this.title = title;
    }
    
    public void init()
    {

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
        
    }
    
    private void render()
    {
        
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
}
