package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Screen extends JFrame {
    public static ArrayList<Shapes> objectsToRender = new ArrayList<>();

    JFrame screen;
    public Screen(){
        this.screen = new JFrame("circle");
        this.screen.setSize(500,500);
        this.screen.setVisible(true);
        this.screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        for(Shapes obj :objectsToRender) {
            g2d.draw((Shape) obj);
        }
    }

    public static void addNewObject(Shapes obj){

        objectsToRender.add(obj);
    }
}
