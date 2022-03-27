package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class Menu extends JPanel{

    static final int Ancho = 300;
    static final int Alto = 300;
    JButton boton = new JButton("Iniciar");

    Menu(){
        this.setPreferredSize(new DimensionUIResource(Ancho, Alto));
        this.setBackground(Color.DARK_GRAY);
        this.setFocusable(true);
        this.add(boton);
        boton.setBounds(50,50,50,50);
        boton.setVisible(true);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == boton) {
                    new MenuPrinc();
                }
            }
        });
    }
 }
