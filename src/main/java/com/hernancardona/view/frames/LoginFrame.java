package com.hernancardona.view.frames;

import com.hernancardona.view.components.ModalDialog;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton forgotPasswordButton;

    public LoginFrame() {
        setTitle("Sofia Library Management System - Login");
        setSize(450, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245, 243, 238)); // Warm cream/paper background
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Header Label
        JLabel titleLabel = new JLabel("Sofia Library Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setForeground(new Color(44, 62, 45)); // Deep library green
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Form Center Panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(mainPanel.getBackground());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username
        gbc.gridx = 0; gbc.gridy = 0;
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        formPanel.add(userLabel, gbc);

        gbc.gridx = 1; gbc.gridy = 0;
        usernameField = new JTextField(15);
        usernameField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        formPanel.add(usernameField, gbc);

        // Password
        gbc.gridx = 0; gbc.gridy = 1;
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        formPanel.add(passLabel, gbc);

        gbc.gridx = 1; gbc.gridy = 1;
        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        formPanel.add(passwordField, gbc);

        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Buttons South Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(mainPanel.getBackground());

        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(44, 62, 45));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 13));
        buttonPanel.add(loginButton);

        forgotPasswordButton = new JButton("Forgot Password");
        forgotPasswordButton.setBackground(new Color(180, 140, 100)); // Warm wood accent
        forgotPasswordButton.setForeground(Color.WHITE);
        forgotPasswordButton.setFont(new Font("SansSerif", Font.PLAIN, 13));
        buttonPanel.add(forgotPasswordButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);

        // Event Handlers
        loginButton.addActionListener(e -> handleLogin());
        forgotPasswordButton.addActionListener(e -> ModalDialog.showInfo(this, "Forgot Password", "Please contact the system administrator to reset your password."));
    }

    private void handleLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            ModalDialog.showError(this, "Validation Error", "Please enter both username and password.");
            return;
        }

        // Role routing based on username prefix or demo matching
        dispose();
        if (username.toLowerCase().contains("admin")) {
            new AdminDashboardFrame().setVisible(true);
        } else if (username.toLowerCase().contains("librarian")) {
            new LibrarianDashboardFrame().setVisible(true);
        } else {
            new MemberDashboardFrame().setVisible(true);
        }
    }
}
