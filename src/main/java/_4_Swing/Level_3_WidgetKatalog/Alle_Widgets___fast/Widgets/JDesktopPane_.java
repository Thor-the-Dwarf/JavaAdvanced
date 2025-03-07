package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;

public class JDesktopPane_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JDesktopPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // ###############################################
        // # Schritt 1: Erstellen eines DesktopPane
        // ###############################################
        JDesktopPane desktopPane = new JDesktopPane();

        // ###############################################
        // # Schritt 2: Erstellen von internen Fenstern
        // ###############################################
        JInternalFrame internalFrame1 = new JInternalFrame("Fenster 1", true, true, true, true);
        internalFrame1.setSize(200, 150);
        internalFrame1.setLocation(50, 50);
        internalFrame1.setVisible(true);

        JInternalFrame internalFrame2 = new JInternalFrame("Fenster 2", true, true, true, true);
        internalFrame2.setSize(300, 200);
        internalFrame2.setLocation(300, 100);
        internalFrame2.setVisible(true);

        // ###############################################
        // # Schritt 3: Hinzufügen der internen Fenster
        // ###############################################
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        // ###############################################
        // # Schritt 4: DesktopPane zum JFrame hinzufügen
        // ###############################################
        frame.add(desktopPane);

        // ###################################################
        // # Schritt 5: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
