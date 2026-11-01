package com.hernancardona.view.panels;

import com.hernancardona.view.components.CustomTable;
import com.hernancardona.view.components.ModalDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LoanPanel extends JPanel {

    private CustomTable loanTable;
    private DefaultTableModel tableModel;
    private JButton issueLoanButton;
    private JButton returnBookButton;
    private JButton refreshButton;

    public LoanPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setBackground(new Color(245, 243, 238));

        initComponents();
    }

    private void initComponents() {
        // Top Panel: Action Buttons
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        topPanel.setBackground(getBackground());

        issueLoanButton = new JButton("Issue Loan");
        returnBookButton = new JButton("Return Book");
        refreshButton = new JButton("Refresh");

        JButton[] buttons = {issueLoanButton, returnBookButton, refreshButton};
        for (JButton b : buttons) {
            b.setBackground(new Color(44, 62, 45));
            b.setForeground(Color.WHITE);
            topPanel.add(b);
        }
        add(topPanel, BorderLayout.NORTH);

        // Center Panel: Loan Table
        String[] columnNames = {"Loan ID", "Book Title", "Member Name", "Borrow Date", "Due Date", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        loanTable = new CustomTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(loanTable);
        add(scrollPane, BorderLayout.CENTER);

        // Actions
        issueLoanButton.addActionListener(e -> ModalDialog.showInfo(this, "Issue Loan", "Issue loan dialog placeholder."));
        returnBookButton.addActionListener(e -> ModalDialog.showInfo(this, "Return Book", "Return book dialog placeholder."));
        refreshButton.addActionListener(e -> ModalDialog.showInfo(this, "Refresh", "Loan list refreshed."));
    }
}
