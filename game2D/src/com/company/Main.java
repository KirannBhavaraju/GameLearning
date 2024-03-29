package com.company;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Main extends Canvas implements Runnable {

    public static final int WIDTH = 640, HEIGHT = WIDTH/12*9 ;
    int frames = 0;
    private Thread thread;
    private boolean running = false;

    private Handler handler;

    public Main(){
        handler = new Handler();
        new Window(WIDTH , HEIGHT, "First Game 2D" , this);

        handler.addObject(new Player(100,100,ID.Player));
    }

    private static final long serialVersionUID;

    static {
        serialVersionUID = 7696779691L;
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true ;
    }


    public synchronized void stop(){
        try{

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running)
        {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >=1)
            {
                tick();
                delta--;
            }
            if(running)
                render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;
                System.out.println("FPS: "+ frames);
                this.frames=frames;
                frames = 0;
            }
        }
        stop();
    }

    private void tick(){
        handler.tick();
    }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.setColor(Color.PINK);
        g.fillRect(0,0,WIDTH,HEIGHT);


        handler.render(g);


        g.dispose();
        bs.show();


    }





    public static void main(String[] args) {
	    new Main();
    }
}
