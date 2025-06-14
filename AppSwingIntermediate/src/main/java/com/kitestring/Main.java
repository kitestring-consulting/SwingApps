package com.kitestring;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CsvViewerFrame frame = new CsvViewerFrame();
            frame.setVisible(true);
        });
    }
}