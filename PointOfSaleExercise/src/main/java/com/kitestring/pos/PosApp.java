package com.kitestring.pos;

import com.kitestring.pos.view.PosFrame;

import javax.swing.*;

public class PosApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PosFrame frame = new PosFrame();
            frame.setVisible(true);
        });
    }
}