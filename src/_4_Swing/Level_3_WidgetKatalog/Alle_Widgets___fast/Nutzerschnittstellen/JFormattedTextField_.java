package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class JFormattedTextField_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JFormattedTextField Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines FormattedTextFields
        // ###############################################
        NumberFormat numberFormat = NumberFormat.getNumberInstance(); // Zahlenformat
        JFormattedTextField formattedTextField = new JFormattedTextField(numberFormat);
        formattedTextField.setColumns(10); // Breite des Textfelds

        // Die häufig genutzten Attribute
        formattedTextField.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart
        formattedTextField.setValue(12345); // Standardwert
        formattedTextField.setToolTipText("Geben Sie eine Zahl ein"); // Tooltip

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um den Inhalt auszulesen
        // ###############################################
        JButton showValueButton = new JButton("Wert anzeigen");
        showValueButton.addActionListener(e -> {
            Object value = formattedTextField.getValue();
            System.out.println("Eingegebener Wert: " + value);
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(formattedTextField);
        frame.add(showValueButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

