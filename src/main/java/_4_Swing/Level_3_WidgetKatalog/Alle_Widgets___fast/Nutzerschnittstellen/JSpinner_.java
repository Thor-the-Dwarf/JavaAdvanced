package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSpinner_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JSpinner Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Spinners
        // ###############################################
        SpinnerNumberModel model = new SpinnerNumberModel(5, 0, 10, 1); // Startwert, Min, Max, Schrittweite
        JSpinner spinner = new JSpinner(model);

        // Die häufig genutzten Attribute
        JComponent editor = spinner.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            ((JSpinner.DefaultEditor) editor).getTextField().setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart setzen
        }

        spinner.setToolTipText("Wählen Sie einen Wert"); // Tooltip-Hinweis

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um den Wert auszulesen
        // ###############################################
        JButton readButton = new JButton("Wert anzeigen");
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Aktueller Spinner-Wert: " + spinner.getValue());
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(spinner);
        frame.add(readButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

