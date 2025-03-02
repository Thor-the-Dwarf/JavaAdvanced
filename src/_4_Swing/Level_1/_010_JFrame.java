package _4_Swing.Level_1;

import javax.swing.*;
import java.awt.*;

public class _010_JFrame {
    public static void main(String[] args) {


        // Erstelle das Hauptfenster
        JFrame frame = new JFrame("Swing Fenster");


        // Setze die Größe des Fensters
        frame.setSize(800, 600);


        // Setze die Mindest- und Maximalgröße

        Dimension i = new java.awt.Dimension(400, 300);
        frame.setMinimumSize(i);
        frame.setMaximumSize(new Dimension(1024, 768));


        // Erstelle ein Label
        JLabel label = new JLabel("irgendwas", SwingConstants.CENTER);
        frame.add(label);
        frame.add(label);
        frame.add(label);
        frame.add(label);


        // Ändere die Hintergrundfarbe
        frame.getContentPane().setBackground(Color.GREEN); // Andere Farben in der Java-Dokumentation


        // Beenden, wenn das Fenster geschlossen wird
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Fenster sichtbar machen
        frame.setVisible(true);
    }
}

