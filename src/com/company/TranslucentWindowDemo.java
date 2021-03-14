package com.company;

import javax.swing.*;
import java.awt.*;

public class TranslucentWindowDemo extends JFrame {
    public TranslucentWindowDemo() {
        super("TranslucentWindow");
        setLayout(new GridBagLayout());

        setSize(300,200);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Add a sample button.
        add(new JButton("I am a Button"));
    }
}
