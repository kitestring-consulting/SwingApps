package com.kitestring.pos.view;

import com.kitestring.pos.model.Product;
import com.kitestring.pos.model.SaleTableModel;
import com.kitestring.pos.service.ProductService;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PosFrame extends JFrame {

    private SaleTableModel saleTableModel;
    private JTable saleTable;
    private JLabel totalLabel;

    public PosFrame() {
        setTitle("Point of Sale");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main container with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // --- Product Panel (WEST) ---
        JPanel productPanel = new JPanel(new GridLayout(0, 4, 10, 10));
        productPanel.setBorder(BorderFactory.createTitledBorder("Products"));

        // TODO CORE TASK 1: Populate productPanel with buttons from ProductService.
        // For each Product, create a JButton.
        // Add an ActionListener to each button to add the product to the sale.
        List<Product> products = ProductService.getProducts();
        // Your code here...

        mainPanel.add(new JScrollPane(productPanel), BorderLayout.CENTER);


        // --- Sale Panel (EAST) ---
        JPanel salePanel = new JPanel(new BorderLayout(5, 5));
        salePanel.setBorder(BorderFactory.createTitledBorder("Current Sale"));
        salePanel.setPreferredSize(new Dimension(400, 0));

        // Sale Table
        saleTableModel = new SaleTableModel();
        saleTable = new JTable(saleTableModel);
        salePanel.add(new JScrollPane(saleTable), BorderLayout.CENTER);

        // Total and Actions Panel
        JPanel southSalePanel = new JPanel(new BorderLayout());
        totalLabel = new JLabel("Total: $0.00");
        totalLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        southSalePanel.add(totalLabel, BorderLayout.NORTH);

        JPanel actionButtonPanel = new JPanel(new GridLayout(1, 0, 5, 5));
        JButton voidButton = new JButton("Void Selected Item");
        JButton newSaleButton = new JButton("New Sale");
        JButton payButton = new JButton("Pay");

        actionButtonPanel.add(voidButton);
        actionButtonPanel.add(newSaleButton);
        actionButtonPanel.add(payButton);
        southSalePanel.add(actionButtonPanel, BorderLayout.SOUTH);

        // TODO CORE TASK 4: Add ActionListeners to the action buttons.
        // - voidButton: Should remove the selected row from the saleTable.
        // - newSaleButton: Should clear the entire sale.
        // - payButton: Should trigger the advanced "Tender Sale" dialog.

        salePanel.add(southSalePanel, BorderLayout.SOUTH);
        mainPanel.add(salePanel, BorderLayout.EAST);

        setContentPane(mainPanel);
    }

    // TODO CORE TASK 5: Create a method to update the totalLabel.
    // This method should be called whenever the sale data changes.
}
