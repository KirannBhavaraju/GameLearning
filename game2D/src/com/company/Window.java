package com.company;

import javax.swing.*;

import java.awt.Canvas;
import java.awt.Dimension;

public class Window extends Canvas {

    private static final long serialVersionUID;

    static {
        serialVersionUID = 7696779690L;
    }

    public Window(int width, int height, String title, Main game){
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();


    }
}
