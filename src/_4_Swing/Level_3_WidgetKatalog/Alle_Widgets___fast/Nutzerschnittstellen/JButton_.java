package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;

public class JButton_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JButton Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // ###############################################
        // # Schritt 1: Erstellen eines Buttons
        // ###############################################
        JButton button = new JButton("Klick mich");

        // Wichtige Attribute setzen
        button.setBackground(Color.LIGHT_GRAY); // Hintergrundfarbe
        button.setForeground(Color.BLUE); // Textfarbe
        button.setFont(new Font("Arial", Font.BOLD, 16)); // Schriftart, -stil und -größe
        button.setToolTipText("Klicke, um eine Aktion auszuführen"); // Tooltip-Hinweis

        // ###############################################
        // # Schritt 2: Aktion für den Button hinzufügen
        // ###############################################
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button wurde geklickt!"));

        // ###############################################
        // # Schritt 3: Button zum JFrame hinzufügen
        // ###############################################
        frame.add(button);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }

}



