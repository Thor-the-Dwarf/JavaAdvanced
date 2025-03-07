package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class JSpinnerDateEditor_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JSpinner.DateEditor Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Date-Spinners
        // ###############################################
        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, java.util.Calendar.DAY_OF_MONTH);
        JSpinner dateSpinner = new JSpinner(dateModel);

        // Die häufig genutzten Attribute
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "dd.MM.yyyy");
        dateSpinner.setEditor(dateEditor);
        dateSpinner.setFont(new Font("Arial", Font.PLAIN, 14));

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um das Datum auszulesen
        // ###############################################
        JButton showDateButton = new JButton("Datum anzeigen");
        showDateButton.addActionListener(e -> {
            Date selectedDate = (Date) dateSpinner.getValue();
            System.out.println("Ausgewähltes Datum: " + selectedDate);
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(dateSpinner);
        frame.add(showDateButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
