package _4_Swing.Level_1;

import javax.swing.*;
import java.awt.*;

public class _020_GridLayout {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("GridLayout Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines GridLayout-Managers
        // ###############################################
        // Das GridLayout teilt den Platz in ein Gitter mit Zeilen und Spalten auf.
        frame.setLayout(new GridLayout(3, 2)); // 3 Zeilen, 2 Spalten

        // ###############################################
        // # Schritt 2: Hinzufügen von Komponenten zum GridLayout
        // ###############################################

        // Hinzufügen von Buttons zu den Zellen des Gitters
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // ###################################################
        // # Schritt 3: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
