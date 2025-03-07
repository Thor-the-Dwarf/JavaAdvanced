package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextArea_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JTextArea Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ###############################################
        // # Schritt 1: Erstellen eines Textbereichs
        // ###############################################
        JTextArea textArea = new JTextArea("Standardtext\nMehrzeiliger Text ist möglich.", 5, 20);

        // Die häufig genutzten Attribute
        textArea.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart, -stil und -größe
        textArea.setBackground(Color.LIGHT_GRAY); // Hintergrundfarbe
        textArea.setForeground(Color.BLACK); // Textfarbe
        textArea.setLineWrap(true); // Automatischer Zeilenumbruch
        textArea.setWrapStyleWord(true); // Zeilenumbruch an Wortgrenzen

        // ###############################################
        // # Schritt 2: Hinzufügen des Textbereichs zu einem JScrollPane
        // ###############################################
        JScrollPane scrollPane = new JScrollPane(textArea);

        // ###############################################
        // # Schritt 3: Aktion hinzufügen, um den Textinhalt zu lesen
        // ###############################################
        JButton readButton = new JButton("Text auslesen");
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Eingegebener Text:\n" + textArea.getText());
            }
        });

        // ###############################################
        // # Schritt 4: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(readButton, BorderLayout.SOUTH);

        // ###################################################
        // # Schritt 5: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
