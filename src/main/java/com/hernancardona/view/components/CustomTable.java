package com.hernancardona.view.components;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class CustomTable extends JTable {

    private static final Color HEADER_BG = new Color(44, 62, 45); // Deep library green
    private static final Color HEADER_FG = Color.WHITE;
    private static final Color ALTERNATE_ROW_BG = new Color(245, 243, 238); // Warm cream
    private static final Color SELECTION_BG = new Color(180, 140, 100); // Warm wood accent

    public CustomTable() {
        super();
        setupTableStyle();
    }

    public CustomTable(javax.swing.table.TableModel dm) {
        super(dm);
        setupTableStyle();
    }

    private void setupTableStyle() {
        setRowHeight(25);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setSelectionBackground(SELECTION_BG);
        setSelectionForeground(Color.WHITE);
        setShowGrid(true);
        setGridColor(new Color(220, 215, 205));
        setFont(new Font("SansSerif", Font.PLAIN, 13));

        JTableHeader header = getTableHeader();
        header.setBackground(HEADER_BG);
        header.setForeground(HEADER_FG);
        header.setFont(new Font("SansSerif", Font.BOLD, 13));
        header.setReorderingAllowed(false);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        if (!isRowSelected(row)) {
            c.setBackground(row % 2 == 0 ? Color.WHITE : ALTERNATE_ROW_BG);
            c.setForeground(Color.DARK_GRAY);
        }
        return c;
    }
}
