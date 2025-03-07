package _4_Swing.Level_3_WidgetKatalog.Layouts;

import javax.swing.*;

public class Bounds_ {
    public static void main(String[] args) {

        // ###############################################
        // # Schritt 1: Hauptfenster erstellen
        // ###############################################
        JFrame frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null); // Manuelles Platzieren der Komponenten

        // ###############################################
        // # Schritt 2: Komponenten hinzufügen
        // ###############################################

        // Button "Row 0, Col 0"
        JButton myButton = new JButton("Row 0, Col 0");
        myButton.setBounds(0, 0, 100, 30); // Position und Größe
        frame.add(myButton);

        // Direktes Hinzufügen beim Erstellen
        JButton button1 = new JButton("Row 0, Col 2");
        button1.setBounds(105, 0, 100, 30); // Position und Größe
        frame.add(button1);

        JButton button2 = new JButton("Row 0, Col 3");
        button2.setBounds(210, 0, 100, 30); // Position und Größe
        frame.add(button2);

        JButton button3 = new JButton("Row 1, Col 1");
        button3.setBounds(0, 40, 100, 30); // Position und Größe
        frame.add(button3);

        JButton button4 = new JButton("Row 1, Col 2");
        button4.setBounds(105, 40, 100, 30); // Position und Größe
        frame.add(button4);

        JButton button5 = new JButton("Row 1, Col 3");
        button5.setBounds(210, 40, 100, 30); // Position und Größe
        frame.add(button5);

        // ###############################################
        // # Schritt 3: Buttons mit Columnspan hinzufügen
        // ###############################################

        // Columnspan=2
        JButton buttonSpan2 = new JButton("columnspan=2");
        buttonSpan2.setBounds(0, 80, 210, 30); // Breite verdoppelt
        frame.add(buttonSpan2);

        // Columnspan=3
        JButton buttonSpan3 = new JButton("columnspan=3");
        buttonSpan3.setBounds(0, 120, 315, 30); // Breite für 3 Spalten
        frame.add(buttonSpan3);

        // ###############################################
        // # Schritt 4: Fenster sichtbar machen
        // ###############################################
        frame.setVisible(true);
    }
}
