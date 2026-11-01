package com.hernancardona.view.panels;

import com.hernancardona.view.components.CustomTable;
import com.hernancardona.view.components.ModalDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FinePanel extends JPanel {

    private CustomTable fineTable;
    private DefaultTableModel tableModel;
    private JButton payFineButton;
    private JButton waiveFineButton;
    private JButton refreshButton;

    public FinePanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setBackground(new Color(245, 243, 238));

        initComponents();
    }

    private void initComponents() {
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        topPanel.setBackground(getBackground());

        payFineButton = new JButton("Pay Fine");
        waiveFineButton = new JButton("Waive Fine");
        refreshButton = new JButton("Refresh");

        JButton[] buttons = {payFineButton, waiveFineButton, refreshButton};
        for (JButton b : buttons) {
            b.setBackground(new Color(44, 62, 45));
            b.setForeground(Color.WHITE);
            topPanel.add(b);
        }
        add(topPanel, BorderLayout.NORTH);

        String[] columnNames = {"Fine ID", "Member Name", "Loan ID", "Amount", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        fineTable = new CustomTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(fineTable);
        add(scrollPane, BorderLayout.CENTER);

        payFineButton.addActionListener(e -> ModalDialog.showInfo(this, "Pay Fine", "Pay fine dialog placeholder."));
        waiveFineButton.addActionListener(e -> ModalDialog.showInfo(this, "Waive Fine", "Waive fine dialog placeholder."));
        refreshButton.addActionListener(e -> ModalDialog.showInfo(this, "Refresh", "Fine list refreshed."));
    }
}
