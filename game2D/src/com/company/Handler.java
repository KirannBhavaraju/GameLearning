package com.company;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void tick(){
        for(int i=0; i < objects.size() ; i++){
            GameObject temp = objects.get(i);

            temp.tick();
        }
    }
    public void render(Graphics g){
        for(int i=0; i < objects.size() ; i++){
            GameObject temp = objects.get(i);

            temp.render(g);
        }
    }

    public void addObject(GameObject parsedObject){
        this.objects.add(parsedObject);
    }

    public void removeObject(GameObject parsedObject){
        this.objects.remove(parsedObject);
    }

}
