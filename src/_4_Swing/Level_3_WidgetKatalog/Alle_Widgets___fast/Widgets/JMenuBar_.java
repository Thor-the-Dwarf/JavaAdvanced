package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuBar_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JMenuBar Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ###############################################
        // # Schritt 1: Erstellen der Menüleiste
        // ###############################################
        JMenuBar menuBar = new JMenuBar();

        // ###############################################
        // # Schritt 2: Erstellen von Menüs und Menüelementen
        // ###############################################
        JMenu fileMenu = new JMenu("Datei");
        JMenu editMenu = new JMenu("Bearbeiten");
        JMenu helpMenu = new JMenu("Hilfe");

        JMenuItem newItem = new JMenuItem("Neu");
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Neu-Option gewählt");
            }
        });

        JMenuItem saveItem = new JMenuItem("Speichern");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Speichern-Option gewählt");
            }
        });

        JMenuItem exitItem = new JMenuItem("Beenden");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Beenden-Option gewählt");
                System.exit(0);
            }
        });

        // Hinzufügen der Menüelemente zu den Menüs
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Trennlinie
        fileMenu.add(exitItem);

        // Hinzufügen der Menüs zur Menüleiste
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // ###############################################
        // # Schritt 3: Menüleiste zum JFrame hinzufügen
        // ###############################################
        frame.setJMenuBar(menuBar);

        JLabel contentLabel = new JLabel("Inhaltsbereich", SwingConstants.CENTER);
        frame.add(contentLabel);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}