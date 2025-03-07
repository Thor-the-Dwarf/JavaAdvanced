package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class JEditorPane_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JEditorPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines JEditorPane
        // ###############################################
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false); // Nur-Anzeige-Modus

        // ###############################################
        // # Schritt 2: Laden einer HTML-Seite
        // ###############################################
        try {
            editorPane.setPage("https://www.example.com"); // Eine Webseite laden
        } catch (IOException e) {
            editorPane.setContentType("text/plain");
            editorPane.setText("Fehler beim Laden der Seite.");
        }

        // Die häufig genutzten Attribute
        editorPane.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart für Text
        editorPane.setBackground(Color.WHITE); // Hintergrundfarbe

        // ###############################################
        // # Schritt 3: JEditorPane in JScrollPane einfügen
        // ###############################################
        JScrollPane scrollPane = new JScrollPane(editorPane);

        // ###############################################
        // # Schritt 4: JScrollPane zum JFrame hinzufügen
        // ###############################################
        frame.add(scrollPane);

        // ###################################################
        // # Schritt 5: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

