package com.kitestring;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CsvViewerFrame extends JFrame {

    private JTable table;
    private JLabel statusBar;
    private CsvTableModel tableModel;

    public CsvViewerFrame() {
        // --- Frame Setup ---
        setTitle("CSV Data Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // --- Main Panel ---
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(mainPanel);

        // --- Menu Bar ---
        setJMenuBar(createMenuBar());

        // --- Toolbar ---
        mainPanel.add(createToolBar(), BorderLayout.NORTH);

        // --- Table ---
        // The table model is created here but will be empty until a file is loaded.
        tableModel = new CsvTableModel();
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true);
        table.setAutoCreateRowSorter(true); // Allows sorting by clicking headers

        // Place the table in a JScrollPane to make it scrollable.
        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // --- Status Bar ---
        statusBar = new JLabel("Ready. Please open a CSV file.");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        mainPanel.add(statusBar, BorderLayout.SOUTH);

        // TODO: (Advanced Task) Add a text field for real-time filtering.
        // You can add it to a panel above the table.
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open CSV...");
        JMenuItem exitItem = new JMenuItem("Exit");

        openItem.addActionListener(this::openCsvFileAction);
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        return menuBar;
    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();
        JButton openButton = new JButton("Open");
        openButton.setToolTipText("Open a CSV file");

        openButton.addActionListener(this::openCsvFileAction);

        toolBar.add(openButton);
        return toolBar;
    }

    /**
     * Action handler for opening a CSV file.
     * @param e The action event.
     */
    private void openCsvFileAction(ActionEvent e) {
        // TODO: Task 1 - Implement JFileChooser logic here.
        // 1. Create and show a JFileChooser.
        // 2. Get the selected file.
        // 3. If a file is selected, start the background task to load it.

        JOptionPane.showMessageDialog(this, "File open logic not yet implemented.", "TODO", JOptionPane.INFORMATION_MESSAGE);

        // TODO: Task 2 - Use a SwingWorker for file loading.
    }
}