package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{

    JButton boton = new JButton();
    Menu menu = new Menu();

    Frame() {
        this.add(menu);
        /*this.add(boton);
        boton.setSize(new Dimension(50,50));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == boton){
                    new MenuPrinc();

                    dispose();
                }
            }
        });*/
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}

