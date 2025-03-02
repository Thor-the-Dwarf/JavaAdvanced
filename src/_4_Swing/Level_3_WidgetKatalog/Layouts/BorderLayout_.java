package _4_Swing.Level_3_WidgetKatalog.Layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("BorderLayout Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines BorderLayout-Managers
        // ###############################################
        // Ein BorderLayout wird automatisch für das JFrame verwendet,
        // also kein explizites Setzen erforderlich. Wir setzen es trotzdem, um es deutlich zu machen.
        frame.setLayout(new BorderLayout());

        // ###############################################
        // # Schritt 2: Hinzufügen von Komponenten zu den BorderLayout-Bereichen
        // ###############################################

//          NORTH
        JLabel labelNorth = new JLabel("NORTH", JLabel.CENTER);
        frame.add(labelNorth, BorderLayout.NORTH);


//          SOUTH
        JLabel labelSouth = new JLabel("SOUTH", JLabel.CENTER);
        frame.add(labelSouth, BorderLayout.SOUTH);


//          WEST
        JLabel labelWest = new JLabel("WEST", JLabel.CENTER);
        frame.add(labelWest, BorderLayout.WEST);


//          EAST
        JLabel labelEast = new JLabel("EAST", JLabel.CENTER);
        frame.add(labelEast, BorderLayout.EAST);


//          Die zentrale Region kann durch eine größere Komponente belegt werden.
        JTextArea labelCenter = new JTextArea("CENTER");
        frame.add(labelCenter, BorderLayout.CENTER);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
