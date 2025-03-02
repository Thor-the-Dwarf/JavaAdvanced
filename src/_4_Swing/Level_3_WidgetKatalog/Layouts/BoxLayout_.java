package _4_Swing.Level_3_WidgetKatalog.Layouts;

import javax.swing.*;

public class BoxLayout_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("BoxLayout Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines BoxLayout-Managers
        // ###############################################
        // Das BoxLayout ordnet Komponenten entweder vertikal oder horizontal an.
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertikale Anordnung

        // ###############################################
        // # Schritt 2: Hinzufügen von Komponenten zum BoxLayout
        // ###############################################

        // Hinzufügen von Buttons
        panel.add(new JButton("Button 1"));
        panel.add(Box.createVerticalStrut(10)); // Vertikaler Abstand
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Button 3"));

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

