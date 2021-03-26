package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setType(Type.UTILITY);
        setUndecorated(true);
        setVisible(true);
        setBackground(new Color(0,0,0,0));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        toBack();
    }
}
