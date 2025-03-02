package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;

public class JSeparator_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JSeparator Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); // Vertikale Anordnung

        // ###############################################
        // # Schritt 1: Erstellen von Komponenten
        // ###############################################
        JLabel label1 = new JLabel("Oben");
        JSeparator separator = new JSeparator(); // Trennlinie
        JLabel label2 = new JLabel("Unten");

        // Die häufig genutzten Attribute
        separator.setForeground(Color.GRAY); // Farbe der Trennlinie
        separator.setPreferredSize(new Dimension(380, 2)); // Breite und Höhe der Trennlinie

        // ###############################################
        // # Schritt 2: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(label1);
        frame.add(separator);
        frame.add(label2);

        // ###################################################
        // # Schritt 3: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
