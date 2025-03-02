package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTable_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JTable Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // ###############################################
        // # Schritt 1: Erstellen einer Tabelle
        // ###############################################
        String[] columnNames = {"ID", "Name", "Alter"};
        Object[][] data = {
                {1, "Max", 25},
                {2, "Anna", 30},
                {3, "Paul", 35},
        };

        JTable table = new JTable(data, columnNames);

        // Die häufig genutzten Attribute
        table.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart
        table.setRowHeight(25); // Höhe der Zeilen
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Einzelne Auswahl
        table.setFillsViewportHeight(true); // Tabelle füllt den Scrollbereich aus

        // ###############################################
        // # Schritt 2: Tabelle in ein JScrollPane einfügen
        // ###############################################
        JScrollPane scrollPane = new JScrollPane(table);

        // ###############################################
        // # Schritt 3: Aktion hinzufügen, um die Auswahl anzuzeigen
        // ###############################################
        JButton showSelectionButton = new JButton("Auswahl anzeigen");
        showSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    Object id = table.getValueAt(selectedRow, 0);
                    Object name = table.getValueAt(selectedRow, 1);
                    Object age = table.getValueAt(selectedRow, 2);
                    System.out.println("Ausgewählt: ID = " + id + ", Name = " + name + ", Alter = " + age);
                } else {
                    System.out.println("Keine Zeile ausgewählt.");
                }
            }
        });

        // ###############################################
        // # Schritt 4: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(showSelectionButton, BorderLayout.SOUTH);

        // ###################################################
        // # Schritt 5: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
