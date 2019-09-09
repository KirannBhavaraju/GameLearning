package com.company;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {
    public Player(int posx, int posy, ID id) {
        super(posx, posy, id);
    }

    @Override
    public void tick() {
        x+=1;
    }

    @Override
    public void render(Graphics g) {
         Random r = new Random();
         g.setColor(Color.getHSBColor(r.nextFloat(),r.nextFloat(),r.nextFloat()));
         g.fillRect(x,y,32,32);
    }
}
