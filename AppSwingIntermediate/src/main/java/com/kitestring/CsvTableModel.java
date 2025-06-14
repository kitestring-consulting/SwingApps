package com.kitestring;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * A custom TableModel for displaying CSV data.
 */
public class CsvTableModel extends AbstractTableModel {

    private List<String> columnNames = new ArrayList<>();
    private List<String[]> data = new ArrayList<>();

    // TODO: Task 3 - Implement the methods of this TableModel.

    public void setData(List<String> columnNames, List<String[]> data) {
        this.columnNames = columnNames;
        this.data = data;
        // Notify the JTable that the model has changed.
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        // This should return the number of data rows.
        return 0; // Placeholder
    }

    @Override
    public int getColumnCount() {
        // This should return the number of columns.
        return 0; // Placeholder
    }

    @Override
    public String getColumnName(int column) {
        // This should return the name of the column at the given index.
        return null; // Placeholder
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // This should return the value for the cell at the given row and column.
        return null; // Placeholder
    }
}
