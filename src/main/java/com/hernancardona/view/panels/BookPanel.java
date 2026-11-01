package com.hernancardona.view.panels;

import com.hernancardona.view.components.CustomTable;
import com.hernancardona.view.components.ModalDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BookPanel extends JPanel {

    private CustomTable bookTable;
    private DefaultTableModel tableModel;
    private JTextField searchField;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton refreshButton;

    public BookPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setBackground(new Color(245, 243, 238));

        initComponents();
    }

    private void initComponents() {
        // Top Panel: Search and Action Buttons
        JPanel topPanel = new JPanel(new BorderLayout(10, 10));
        topPanel.setBackground(getBackground());

        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        searchPanel.setBackground(getBackground());
        searchPanel.add(new JLabel("Search Book:"));
        searchField = new JTextField(20);
        searchPanel.add(searchField);
        JButton searchButton = new JButton("Search");
        searchButton.setBackground(new Color(44, 62, 45));
        searchButton.setForeground(Color.WHITE);
        searchPanel.add(searchButton);

        topPanel.add(searchPanel, BorderLayout.WEST);

        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        actionPanel.setBackground(getBackground());

        addButton = new JButton("Add Book");
        editButton = new JButton("Edit Book");
        deleteButton = new JButton("Delete Book");
        refreshButton = new JButton("Refresh");

        JButton[] buttons = {addButton, editButton, deleteButton, refreshButton};
        for (JButton b : buttons) {
            b.setBackground(new Color(180, 140, 100));
            b.setForeground(Color.WHITE);
            actionPanel.add(b);
        }

        topPanel.add(actionPanel, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        // Center Panel: Book Table
        String[] columnNames = {"ID", "ISBN", "Title", "Author", "Publisher", "Year", "Category", "Copies"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        bookTable = new CustomTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        add(scrollPane, BorderLayout.CENTER);

        // Dummy actions for UI responsiveness
        addButton.addActionListener(e -> ModalDialog.showInfo(this, "Add Book", "Add Book dialog placeholder."));
        editButton.addActionListener(e -> ModalDialog.showInfo(this, "Edit Book", "Edit Book dialog placeholder."));
        deleteButton.addActionListener(e -> ModalDialog.showInfo(this, "Delete Book", "Delete Book action placeholder."));
        refreshButton.addActionListener(e -> ModalDialog.showInfo(this, "Refresh", "Book list refreshed."));
    }
}
