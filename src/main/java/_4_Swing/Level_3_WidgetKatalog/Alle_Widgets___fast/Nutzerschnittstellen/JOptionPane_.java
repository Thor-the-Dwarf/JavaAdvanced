package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPane_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JOptionPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Schaltflächen für verschiedene Dialoge erstellen
        // ###############################################
        JButton infoButton = new JButton("Info anzeigen");
        JButton confirmButton = new JButton("Bestätigung anzeigen");
        JButton inputButton = new JButton("Eingabe anzeigen");

        // ###############################################
        // # Schritt 2: Aktionen für die Dialoge hinzufügen
        // ###############################################
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Dies ist eine Informationsnachricht.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "Möchten Sie fortfahren?", "Bestätigung", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    System.out.println("Benutzer hat 'Ja' gewählt.");
                } else {
                    System.out.println("Benutzer hat 'Nein' gewählt.");
                }
            }
        });

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Geben Sie etwas ein:", "Eingabe", JOptionPane.PLAIN_MESSAGE);
                if (input != null) {
                    System.out.println("Eingegebener Text: " + input);
                } else {
                    System.out.println("Keine Eingabe.");
                }
            }
        });

        // ###############################################
        // # Schritt 3: Schaltflächen zum JFrame hinzufügen
        // ###############################################
        frame.add(infoButton);
        frame.add(confirmButton);
        frame.add(inputButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
