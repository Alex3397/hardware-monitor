package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setType(Type.UTILITY);
        setUndecorated(true);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(new Color(0,0,0,0));
//        toBack();
    }
}
