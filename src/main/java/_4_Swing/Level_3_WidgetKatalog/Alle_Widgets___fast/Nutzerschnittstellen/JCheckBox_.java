package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBox_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JCheckBox Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen einer Checkbox
        // ###############################################
        JCheckBox checkBox = new JCheckBox("Option aktivieren", false);

        // Die häufig genutzten Attribute
        checkBox.setBackground(Color.LIGHT_GRAY); // Hintergrundfarbe
        checkBox.setForeground(Color.DARK_GRAY); // Textfarbe
        checkBox.setFont(new Font("Arial", Font.BOLD, 14)); // Schriftart, -stil und -größe
        checkBox.setToolTipText("Aktivieren oder deaktivieren Sie die Option"); // Tooltip-Hinweis

        // ###############################################
        // # Schritt 2: Aktion für die Checkbox hinzufügen
        // ###############################################
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Checkbox ist " + (checkBox.isSelected() ? "aktiviert" : "deaktiviert"));
            }
        });

        // ###############################################
        // # Schritt 3: Checkbox zum JFrame hinzufügen
        // ###############################################
        frame.add(checkBox);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
