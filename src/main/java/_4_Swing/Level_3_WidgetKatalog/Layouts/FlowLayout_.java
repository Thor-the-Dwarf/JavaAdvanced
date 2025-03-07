package _4_Swing.Level_3_WidgetKatalog.Layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("FlowLayout Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines FlowLayout-Managers
        // ###############################################
        // Das FlowLayout sorgt dafür, dass Komponenten nebeneinander
        // in der Reihenfolge ihrer Hinzufügung angeordnet werden.
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 2: Hinzufügen von Komponenten zum FlowLayout
        // ###############################################

        // Hinzufügen von Buttons
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));

        // ###################################################
        // # Schritt 3: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
