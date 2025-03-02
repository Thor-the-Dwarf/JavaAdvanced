package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSlider_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JSlider Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Sliders
        // ###############################################
        JSlider slider = new JSlider(0, 100, 50);

        // Die häufig genutzten Attribute
        slider.setMajorTickSpacing(20); // Haupt-Abstände
        slider.setMinorTickSpacing(5); // Zwischen-Abstände
        slider.setPaintTicks(true); // Ticks anzeigen
        slider.setPaintLabels(true); // Labels anzeigen
        slider.setFont(new Font("Arial", Font.PLAIN, 12)); // Schriftart für Labels

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um den Wert auszulesen
        // ###############################################
        JButton readButton = new JButton("Wert anzeigen");
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Aktueller Slider-Wert: " + slider.getValue());
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(slider);
        frame.add(readButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

