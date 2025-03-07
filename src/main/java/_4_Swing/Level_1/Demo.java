package _4_Swing.Level_1;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(400, 500, Color.CYAN);
    }
}

class MyFrame extends JFrame {

    MyFrame(int width, int height, Color color) {
        // Setze die Größe des Fensters
        this.setSize(width, height);
        // Setze die Mindest- und Maximalgröße
        Dimension i = new java.awt.Dimension(400, 300);
        this.setMinimumSize(i);
        this.setMaximumSize(new Dimension(1024, 768));
        // Erstelle ein Label
        JLabel label = new JLabel("irgendwas", SwingConstants.CENTER);
        this.add(label);
        // Ändere die Hintergrundfarbe
        this.getContentPane().setBackground(color); // Andere Farben in der Java-Dokumentation
        // Beenden, wenn das Fenster geschlossen wird
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Fenster sichtbar machen
        this.setVisible(true);
    }
}
