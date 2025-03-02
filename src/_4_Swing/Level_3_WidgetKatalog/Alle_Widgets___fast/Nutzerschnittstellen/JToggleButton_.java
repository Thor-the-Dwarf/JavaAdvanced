package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButton_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JToggleButton Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Toggle-Buttons
        // ###############################################
        JToggleButton toggleButton = new JToggleButton("Aus");

        // Die häufig genutzten Attribute
        toggleButton.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart
        toggleButton.setBackground(Color.LIGHT_GRAY); // Hintergrundfarbe
        toggleButton.setToolTipText("Klicken, um den Zustand zu wechseln"); // Tooltip

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um den Zustand zu ändern und auszulesen
        // ###############################################
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("Ein");
                    System.out.println("ToggleButton ist EIN.");
                } else {
                    toggleButton.setText("Aus");
                    System.out.println("ToggleButton ist AUS.");
                }
            }
        });

        // ###############################################
        // # Schritt 3: ToggleButton zum JFrame hinzufügen
        // ###############################################
        frame.add(toggleButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
