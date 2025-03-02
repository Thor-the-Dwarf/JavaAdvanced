package _4_Swing.Level_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class _030_ActionListener_Evolution {

    public static void main(String[] args) {

        // Hauptfenster erstellen
        JFrame frame = new JFrame("Erweiterte Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 1)); // 6 Zeilen, 1 Spalte

        // ###############################################
        // Panel für zufällige Farben
        // ###############################################
        JPanel colorPanel = new JPanel();
        frame.add(colorPanel);

        // ###############################################
        // # Button 1: Private Klasse, die ActionListener implementiert
        // ###############################################
        JButton button1 = new JButton("Private Klasse");
        button1.addActionListener(new PrivateActionListener(colorPanel));
        frame.add(button1);

        // ###############################################
        // # Button 2: ActionListener-Objekt überschreiben
        // ###############################################
        JButton button2 = new JButton("Überschriebenes Objekt");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(getRandomColor());
            }
        });
        frame.add(button2);

        // ###############################################
        // # Button 3: Lambda mit einzeiliger Funktion
        // ###############################################
        JButton button3 = new JButton("Lambda (einzeilig)");
        button3.addActionListener(e -> colorPanel.setBackground(getRandomColor()));
        frame.add(button3);

        // ###############################################
        // # Button 4: Lambda mit mehrzeiliger Funktion
        // ###############################################
        JButton button4 = new JButton("Lambda (mehrzeilig)");
        button4.addActionListener(e -> {
            colorPanel.setBackground(getRandomColor());
            System.out.println("Mehrzeilige Lambda-Funktion ausgeführt");
        });
        frame.add(button4);

        // ###############################################
        // # Button 5: Methode referenzieren
        // ###############################################
        JButton button5 = new JButton("Methodenreferenz");
        button5.addActionListener(e -> setRandomColor(colorPanel));
        frame.add(button5);

        // Fenster sichtbar machen
        frame.setVisible(true);
    }

    // ###############################################
    // # Button 1: Private Klasse, die ActionListener implementiert
    // ###############################################
    private static class PrivateActionListener implements ActionListener {
        private final JPanel panel;

        public PrivateActionListener(JPanel panel) {
            this.panel = panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(getRandomColor());
        }
    }

    // ###############################################
    // # Button 5: Methode referenzieren
    // ###############################################
    private static void setRandomColor(JPanel panel) {
        panel.setBackground(getRandomColor());
    }

    // ###############################################
    // Methode zur Generierung einer zufälligen Farbe
    // ###############################################
    private static Color getRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}


