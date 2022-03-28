package com.company;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    Menu menu = new Menu();

    Frame() {
        this.add(menu);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

class imagen extends JPanel{
    public imagen(){
        this.setSize(200,200);
    }

    public void paint(Graphics g){
        
    }
}