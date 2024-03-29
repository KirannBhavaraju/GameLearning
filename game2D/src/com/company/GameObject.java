package com.company;

import java.awt.*;

public abstract class GameObject {

    protected int x,y;
    protected ID id;

    public GameObject(int posx,int posy,ID id){
        this.x = posx;
        this.y = posy;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);


    // ---------------------------------------------------
    // Getters and Setters
    public void setX(int x){
        this.x= x;
    }
    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y= y;
    }
    public int getY(){
        return y;
    }

    public void setId(ID id){
        this.id = id;
    }
    public ID getId(){
        return id;
    }
    // ---------------------------------------------------

}
