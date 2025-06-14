package com.kitestring.pos.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class SaleTableModel extends AbstractTableModel {

    private final List<SaleItem> saleItems = new ArrayList<>();
    private final String[] columnNames = {"Item", "Price", "Qty", "Total"};

    // TODO CORE TASK 2: Implement all methods of this AbstractTableModel.

    @Override
    public int getRowCount() {
        // Your code here
        return 0;
    }

    @Override
    public int getColumnCount() {
        // Your code here
        return 0;
    }

    @Override
    public String getColumnName(int column) {
        // Your code here
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Your code here
        return null;
    }

    // TODO CORE TASK 3: Create methods to manage the sale items.
    // - A method to add a product to the sale.
    //   (Handle incrementing quantity if the product already exists).
    // - A method to remove an item at a specific row.
    // - A method to clear all items for a new sale.
    // - A method to calculate the grand total of the sale.
    // Remember to call fireTable...() methods after data changes!
}
