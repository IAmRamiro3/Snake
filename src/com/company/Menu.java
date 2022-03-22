package com.company;

import java.awt.Color;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import org.w3c.dom.events.Event;

public class Menu extends JPanel implements ActionListener {

    static final int Ancho = 200;
    static final int Alto = 200;
    public JButton boton = new JButton();

    Menu(){
        this.setPreferredSize(new DimensionUIResource(Ancho, Alto));
        this.setBackground(Color.DARK_GRAY);
        this.setFocusable(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }

}