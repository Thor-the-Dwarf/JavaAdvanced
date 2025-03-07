package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;

public class JTabbedPane_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JTabbedPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ###############################################
        // # Schritt 1: Erstellen eines TabbedPane
        // ###############################################
        JTabbedPane tabbedPane = new JTabbedPane();

        // ###############################################
        // # Schritt 2: Erstellen von Panels für die Tabs
        // ###############################################
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Inhalt von Tab 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Inhalt von Tab 2"));

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Inhalt von Tab 3"));

        // Die häufig genutzten Attribute
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);
        tabbedPane.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart der Tabs

        // ###############################################
        // # Schritt 3: TabbedPane zum JFrame hinzufügen
        // ###############################################
        frame.add(tabbedPane);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
