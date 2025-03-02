package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenu_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JPopupMenu Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Popup-Menüs
        // ###############################################
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem item1 = new JMenuItem("Option 1");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 1 gewählt");
            }
        });

        JMenuItem item2 = new JMenuItem("Option 2");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2 gewählt");
            }
        });

        JMenuItem item3 = new JMenuItem("Option 3");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 3 gewählt");
            }
        });

        // Menüelemente hinzufügen
        popupMenu.add(item1);
        popupMenu.add(item2);
        popupMenu.add(item3);

        // ###############################################
        // # Schritt 2: Popup-Menü auf ein Panel binden
        // ###############################################
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.LIGHT_GRAY);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(panel, e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(panel, e.getX(), e.getY());
                }
            }
        });


        // ###############################################
        // # Schritt 3: Panel zum JFrame hinzufügen
        // ###############################################
        frame.add(panel);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

