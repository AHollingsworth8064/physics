package org.example;

import java.awt.*;

public abstract class Shapes{
    public void draw(){
        Screen.objectsToRender.add(this);
    }
    public void move(){
        ;
    }

}
