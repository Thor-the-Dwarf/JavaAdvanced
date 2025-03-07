package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JComboBox Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen einer ComboBox
        // ###############################################
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Die häufig genutzten Attribute
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart, -stil und -größe
        comboBox.setBackground(Color.WHITE); // Hintergrundfarbe
        comboBox.setForeground(Color.BLACK); // Textfarbe
        comboBox.setToolTipText("Wählen Sie eine Option aus"); // Tooltip-Hinweis

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um die Auswahl auszulesen
        // ###############################################
        JButton readButton = new JButton("Auswahl anzeigen");
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ausgewählte Option: " + comboBox.getSelectedItem());
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(comboBox);
        frame.add(readButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
