## Objective:
Your task is to build a basic, single-screen Point of Sale (POS) interface using Java Swing. We have provided a skeleton project with a Maven pom.xml to get you started. Your goal is to implement the core logic to make the interface functional.

## Workflow:

- Review the provided skeleton code (PosFrame.java, SaleTableModel.java, etc.).
- Implement the functionality described in the "Core Requirements" section by filling in the // TODO: blocks.
- If time permits, attempt the "Advanced Tasks" to demonstrate deeper knowledge.
- You can run the application at any time by executing the Maven goal mvn compile exec:java.

### Core Requirements
1. Populate Products: In `PosFrame.java`, dynamically create a `JButton` for each `Product` from the `ProductService` and add it to the `productPanel`.
2. Implement `TableModel`: In `SaleTableModel.java`, fully implement the methods (`getRowCount`, `getColumnCount`, etc.) to correctly display the sale items.
3. Manage Sale Data: In `SaleTableModel.java`, create the public methods to add/remove/clear items. When a product button is clicked in the `PosFrame`, it should call the method here to add the product. If a product already exists in the sale, its quantity should be incremented.
4. Implement Action Buttons: In `PosFrame.java`, implement the `ActionListener` logic for the "Void Selected Item" and "New Sale" buttons. These listeners should call the appropriate methods in your `SaleTableModel`.
5. Update Grand Total: The `totalLabel` must be updated to show the correct grand total whenever an item is added or removed from the sale.

### Advanced Tasks
1. Tender Sale Dialog: When the "Pay" button is clicked, open a `JDialog`. This dialog should display the final total, include a `JTextField` to enter the amount of cash received, and a button to calculate and display the change due.
2. Editable Quantity: Make the "Qty" column in the `JTable` editable. Use a `TableCellEditor` (e.g., a `DefaultCellEditor` with a `JSpinner` or a formatted `JTextField`) to allow the user to directly change the quantity of an item. Ensure only positive integers can be entered.
3. Look and Feel Menu: Add a `JMenuBar` to the `PosFrame` with a "View" menu that allows the user to switch between different Swing Look and Feels (e.g., "Nimbus", "Metal", "System Default").