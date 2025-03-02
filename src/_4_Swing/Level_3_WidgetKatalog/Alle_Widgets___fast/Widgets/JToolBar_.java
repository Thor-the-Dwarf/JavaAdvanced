package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBar_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JToolBar Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ###############################################
        // # Schritt 1: Erstellen einer Werkzeugleiste
        // ###############################################
        JToolBar toolBar = new JToolBar("Werkzeugleiste");

        // Die häufig genutzten Attribute
        toolBar.setFloatable(false); // Deaktivieren des Verschiebens der Werkzeugleiste
        toolBar.setBackground(Color.LIGHT_GRAY); // Hintergrundfarbe
        toolBar.setOrientation(SwingConstants.HORIZONTAL); // Horizontale Ausrichtung

        // ###############################################
        // # Schritt 2: Hinzufügen von Buttons zur Werkzeugleiste
        // ###############################################
        JButton newButton = new JButton("Neu");
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Neu-Button geklickt!");
            }
        });

        JButton saveButton = new JButton("Speichern");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Speichern-Button geklickt!");
            }
        });

        JButton exitButton = new JButton("Beenden");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Beenden-Button geklickt!");
            }
        });

        toolBar.add(newButton);
        toolBar.add(saveButton);
        toolBar.add(exitButton);

        // ###############################################
        // # Schritt 3: Werkzeugleiste und Inhaltspanel hinzufügen
        // ###############################################
        frame.setLayout(new BorderLayout());
        frame.add(toolBar, BorderLayout.NORTH);

        JLabel contentLabel = new JLabel("Inhaltsbereich", SwingConstants.CENTER);
        frame.add(contentLabel, BorderLayout.CENTER);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

