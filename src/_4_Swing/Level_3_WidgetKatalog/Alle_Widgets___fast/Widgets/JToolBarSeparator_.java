package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;

public class JToolBarSeparator_ {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JToolBar.Separator Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Button 1"));
        toolBar.addSeparator();
        toolBar.add(new JButton("Button 2"));
        frame.add(toolBar, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
