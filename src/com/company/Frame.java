package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JButton boton = new JButton("Hola");

    Frame() {
        this.add(new Panel());
        boton.setBounds(100,100,50,50);
        this.add(boton);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton){
            new Panel();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
