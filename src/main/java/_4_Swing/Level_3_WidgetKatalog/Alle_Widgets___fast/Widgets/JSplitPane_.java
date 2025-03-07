package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;

public class JSplitPane_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JSplitPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ###############################################
        // # Schritt 1: Erstellen der Komponenten für die Bereiche
        // ###############################################
        JLabel leftLabel = new JLabel("Linker Bereich", SwingConstants.CENTER);
        JLabel rightLabel = new JLabel("Rechter Bereich", SwingConstants.CENTER);

        // Hintergrundfarben setzen (optional)
        leftLabel.setOpaque(true);
        leftLabel.setBackground(Color.LIGHT_GRAY);

        rightLabel.setOpaque(true);
        rightLabel.setBackground(Color.CYAN);

        // ###############################################
        // # Schritt 2: Erstellen eines SplitPane
        // ###############################################
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftLabel, rightLabel);

        // Die häufig genutzten Attribute
        splitPane.setDividerLocation(150); // Anfangsposition des Trenners
        splitPane.setOneTouchExpandable(true); // Hinzufügen von Buttons zum Ein- und Ausklappen
        splitPane.setDividerSize(10); // Breite des Trenners

        // ###############################################
        // # Schritt 3: SplitPane zum JFrame hinzufügen
        // ###############################################
        frame.add(splitPane);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
