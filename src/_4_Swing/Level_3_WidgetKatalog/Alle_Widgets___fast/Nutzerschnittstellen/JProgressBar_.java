package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBar_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JProgressBar Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen einer Fortschrittsanzeige
        // ###############################################
        JProgressBar progressBar = new JProgressBar(0, 100); // Min = 0, Max = 100
        progressBar.setValue(50); // Startwert
        progressBar.setStringPainted(true); // Prozentanzeige aktivieren

        // Die häufig genutzten Attribute
        progressBar.setForeground(Color.GREEN); // Farbe des Fortschritts
        progressBar.setBackground(Color.LIGHT_GRAY); // Hintergrundfarbe
        progressBar.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart für die Anzeige

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um den Fortschritt zu ändern
        // ###############################################
        JButton increaseButton = new JButton("Fortschritt erhöhen");
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = progressBar.getValue();
                if (currentValue < 100) {
                    progressBar.setValue(currentValue + 10);
                }
            }
        });

        JButton decreaseButton = new JButton("Fortschritt verringern");
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentValue = progressBar.getValue();
                if (currentValue > 0) {
                    progressBar.setValue(currentValue - 10);
                }
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(progressBar);
        frame.add(increaseButton);
        frame.add(decreaseButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

