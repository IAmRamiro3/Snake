package com.company;

import javax.swing.*;

public class MenuPrinc extends JFrame {
    MenuPrinc(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Panel());
        this.setTitle("Juego");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
