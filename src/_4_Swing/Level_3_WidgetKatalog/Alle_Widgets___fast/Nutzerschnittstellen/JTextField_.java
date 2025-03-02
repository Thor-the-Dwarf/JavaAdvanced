package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JTextField Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Textfelds
        // ###############################################
        JTextField textField = new JTextField("Geben Sie etwas ein", 20);

        // Die häufig genutzten Attribute
        textField.setBackground(Color.WHITE); // Hintergrundfarbe
        textField.setForeground(Color.BLACK); // Textfarbe
        textField.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart, -stil und -größe
        textField.setToolTipText("Text eingeben und Enter drücken"); // Tooltip-Hinweis

        // ###############################################
        // # Schritt 2: Aktion für das Textfeld hinzufügen
        // ###############################################
        JButton button = new JButton("getText()");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Eingegebener Text: " + textField.getText());
            }
        });

        // ###############################################
        // # Schritt 3: Textfeld zum JFrame hinzufügen
        // ###############################################
        frame.add(textField);
        frame.add(button);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
