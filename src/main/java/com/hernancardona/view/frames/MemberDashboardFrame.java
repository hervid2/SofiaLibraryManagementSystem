package com.hernancardona.view.frames;

import com.hernancardona.view.panels.*;

import javax.swing.*;
import java.awt.*;

public class MemberDashboardFrame extends JFrame {

    public MemberDashboardFrame() {
        setTitle("Sofia Library Management System - Member Portal");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Top Toolbar Panel with Logout Button
        JPanel topToolbar = new JPanel(new BorderLayout());
        topToolbar.setBackground(new Color(44, 62, 45)); // Deep library green
        topToolbar.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));

        JLabel welcomeLabel = new JLabel("Welcome, Member");
        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        welcomeLabel.setForeground(Color.WHITE);
        topToolbar.add(welcomeLabel, BorderLayout.WEST);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBackground(new Color(180, 140, 100)); // Warm wood accent
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(e -> {
            dispose();
            new LoginFrame().setVisible(true);
        });

        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        rightPanel.setOpaque(false);
        rightPanel.add(logoutButton);
        topToolbar.add(rightPanel, BorderLayout.EAST);

        add(topToolbar, BorderLayout.NORTH);

        // Tabbed Pane for Management Panels
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("SansSerif", Font.BOLD, 13));

        tabbedPane.addTab("Catalog & Search", new BookPanel());
        tabbedPane.addTab("My Loans", new LoanPanel());
        tabbedPane.addTab("My Reservations", new ReservationPanel());
        tabbedPane.addTab("My Fines", new FinePanel());

        add(tabbedPane, BorderLayout.CENTER);
    }
}
