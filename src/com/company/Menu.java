package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class Menu extends JFrame implements ActionListener {

    static final int Ancho = 200;
    static final int Alto = 200;
    public JButton boton = new JButton("Iniciar");

    Menu(){
        this.setPreferredSize(new DimensionUIResource(Ancho, Alto));
        this.setBackground(Color.DARK_GRAY);
        this.setFocusable(true);
        boton.setBounds(100,100,100,100);
        this.add(boton);
        boton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton){
            //this.add(new Panel());
            //System.exit(0);
            new Panel();

        }
    }

}