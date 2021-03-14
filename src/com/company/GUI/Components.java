package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class Components {
    public static JLabel LabelText(String label) {
        JLabel lb = new JLabel(label);
        lb.setForeground(Color.CYAN);
        return lb;
    }

    public static JLabel TextField(String textField) {
        JLabel jtx = new JLabel(textField);
        jtx.setForeground(Color.WHITE);
        return jtx;
    }
}
