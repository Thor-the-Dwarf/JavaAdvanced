package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooser_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JColorChooser Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen einer Schaltfläche
        // ###############################################
        JButton chooseColorButton = new JButton("Farbe auswählen");
        JLabel colorLabel = new JLabel("Keine Farbe ausgewählt");
        colorLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um den Farbwähler zu öffnen
        // ###############################################
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(frame, "Wähle eine Farbe", Color.WHITE);
                if (selectedColor != null) {
                    colorLabel.setText("Gewählte Farbe: " + selectedColor.toString());
                    colorLabel.setForeground(selectedColor);
                } else {
                    colorLabel.setText("Keine Farbe ausgewählt");
                }
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(chooseColorButton);
        frame.add(colorLabel);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
