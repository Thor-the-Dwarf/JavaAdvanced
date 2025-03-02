package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;

public class JLabel_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JLabel Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Labels
        // ###############################################
        JLabel label = new JLabel("Standardtext");

        // Die häufig genutzten Attribute
        label.setFont(new Font("Arial", Font.BOLD, 16)); // Schriftart
        label.setForeground(Color.BLUE); // Textfarbe
        label.setHorizontalAlignment(SwingConstants.CENTER); // Zentrierte Ausrichtung
        label.setToolTipText("Dies ist ein Label"); // Tooltip

        // ###############################################
        // # Schritt 2: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(label);

        // ###################################################
        // # Schritt 3: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
