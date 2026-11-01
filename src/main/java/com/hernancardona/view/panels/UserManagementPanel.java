package com.hernancardona.view.panels;

import com.hernancardona.view.components.CustomTable;
import com.hernancardona.view.components.ModalDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class UserManagementPanel extends JPanel {

    private CustomTable userTable;
    private DefaultTableModel tableModel;
    private JButton addUserButton;
    private JButton editUserButton;
    private JButton deleteUserButton;
    private JButton refreshButton;

    public UserManagementPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setBackground(new Color(245, 243, 238));

        initComponents();
    }

    private void initComponents() {
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        topPanel.setBackground(getBackground());

        addUserButton = new JButton("Add User");
        editUserButton = new JButton("Edit User");
        deleteUserButton = new JButton("Delete User");
        refreshButton = new JButton("Refresh");

        JButton[] buttons = {addUserButton, editUserButton, deleteUserButton, refreshButton};
        for (JButton b : buttons) {
            b.setBackground(new Color(180, 140, 100));
            b.setForeground(Color.WHITE);
            topPanel.add(b);
        }
        add(topPanel, BorderLayout.NORTH);

        String[] columnNames = {"User ID", "Username", "Email", "Role", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        userTable = new CustomTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(userTable);
        add(scrollPane, BorderLayout.CENTER);

        addUserButton.addActionListener(e -> ModalDialog.showInfo(this, "Add User", "Add user dialog placeholder."));
        editUserButton.addActionListener(e -> ModalDialog.showInfo(this, "Edit User", "Edit user dialog placeholder."));
        deleteUserButton.addActionListener(e -> ModalDialog.showInfo(this, "Delete User", "Delete user action placeholder."));
        refreshButton.addActionListener(e -> ModalDialog.showInfo(this, "Refresh", "User list refreshed."));
    }
}
