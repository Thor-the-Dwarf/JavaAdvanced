package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JList_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JList Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // ###############################################
        // # Schritt 1: Erstellen einer Liste
        // ###############################################
        String[] items = {"Element 1", "Element 2", "Element 3", "Element 4"};
        JList<String> list = new JList<>(items);

        // Die häufig genutzten Attribute
        list.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Einzelne Auswahl
        list.setVisibleRowCount(4); // Anzahl sichtbarer Zeilen

        // Hinzufügen der Liste zu einem JScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um die Auswahl auszulesen
        // ###############################################
        JButton showSelectionButton = new JButton("Auswahl anzeigen");
        showSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = list.getSelectedValue();
                System.out.println("Ausgewähltes Element: " + (selectedItem != null ? selectedItem : "Keine Auswahl"));
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(showSelectionButton, BorderLayout.SOUTH);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
