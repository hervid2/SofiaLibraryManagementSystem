package com.hernancardona.view.panels;

import com.hernancardona.view.components.CustomTable;
import com.hernancardona.view.components.ModalDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ReservationPanel extends JPanel {

    private CustomTable reservationTable;
    private DefaultTableModel tableModel;
    private JButton createReservationButton;
    private JButton cancelReservationButton;
    private JButton refreshButton;

    public ReservationPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setBackground(new Color(245, 243, 238));

        initComponents();
    }

    private void initComponents() {
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        topPanel.setBackground(getBackground());

        createReservationButton = new JButton("Create Reservation");
        cancelReservationButton = new JButton("Cancel Reservation");
        refreshButton = new JButton("Refresh");

        JButton[] buttons = {createReservationButton, cancelReservationButton, refreshButton};
        for (JButton b : buttons) {
            b.setBackground(new Color(180, 140, 100));
            b.setForeground(Color.WHITE);
            topPanel.add(b);
        }
        add(topPanel, BorderLayout.NORTH);

        String[] columnNames = {"Reservation ID", "Book Title", "Member Name", "Reservation Date", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        reservationTable = new CustomTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(reservationTable);
        add(scrollPane, BorderLayout.CENTER);

        createReservationButton.addActionListener(e -> ModalDialog.showInfo(this, "Create Reservation", "Create reservation dialog placeholder."));
        cancelReservationButton.addActionListener(e -> ModalDialog.showInfo(this, "Cancel Reservation", "Cancel reservation action placeholder."));
        refreshButton.addActionListener(e -> ModalDialog.showInfo(this, "Refresh", "Reservation list refreshed."));
    }
}
