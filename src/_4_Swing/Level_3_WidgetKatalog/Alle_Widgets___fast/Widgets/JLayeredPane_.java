package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;

public class JLayeredPane_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JLayeredPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines LayeredPane
        // ###############################################
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400, 400));

        // ###############################################
        // # Schritt 2: Hinzufügen von Komponenten in verschiedenen Ebenen
        // ###############################################
        JLabel backgroundLabel = new JLabel("Hintergrund");
        backgroundLabel.setOpaque(true);
        backgroundLabel.setBackground(Color.LIGHT_GRAY);
        backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundLabel.setBounds(50, 50, 300, 300);

        JLabel middleLabel = new JLabel("Mittlere Ebene");
        middleLabel.setOpaque(true);
        middleLabel.setBackground(Color.CYAN);
        middleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        middleLabel.setBounds(100, 100, 200, 200);

        JLabel topLabel = new JLabel("Vordergrund");
        topLabel.setOpaque(true);
        topLabel.setBackground(Color.PINK);
        topLabel.setHorizontalAlignment(SwingConstants.CENTER);
        topLabel.setBounds(150, 150, 100, 100);

        layeredPane.add(backgroundLabel, Integer.valueOf(0)); // Hintergrundebene
        layeredPane.add(middleLabel, Integer.valueOf(1));     // Mittlere Ebene
        layeredPane.add(topLabel, Integer.valueOf(2));        // Vordergrundebene

        // ###############################################
        // # Schritt 3: LayeredPane zum JFrame hinzufügen
        // ###############################################
        frame.add(layeredPane);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.pack();
        frame.setVisible(true);
    }
}
