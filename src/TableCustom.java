
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nejc
 */
public class TableCustom {

    public static void apply(JScrollPane scroll, TableType type) {
        JTable table = (JTable) scroll.getViewport().getComponent(0);
        table.setSelectionBackground(new Color(123, 207, 255));
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setDefaultRenderer(new TableHeaderCustomCellRender(table));
        table.setRowHeight(30);

        table.setShowVerticalLines(false);
        table.setGridColor(new Color(220, 220, 220));
        table.setForeground(new Color(51, 51, 51));
        table.setSelectionForeground(new Color(51, 51, 51));
        scroll.setBorder(new LineBorder(new Color(220, 220, 220)));
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics grphcs) {
                super.paint(grphcs);
                grphcs.setColor(new Color(220, 220, 220));
                grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
                grphcs.dispose();
            }
        };
        panel.setBackground(new Color(250, 250, 250));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(Color.WHITE);
        table.getTableHeader().setBackground(new Color(250, 250, 250));

    }

    public static enum TableType {
        MULTI_LINE, DEFAULT
    }

}
