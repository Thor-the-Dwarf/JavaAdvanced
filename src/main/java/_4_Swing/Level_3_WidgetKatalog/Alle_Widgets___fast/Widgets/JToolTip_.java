package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import java.awt.*;

public class JToolTip_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JToolTip Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen von Komponenten mit Tooltips
        // ###############################################
        JButton button = new JButton("Button");
        button.setToolTipText("Dies ist ein Button. Klicke hier!");

        JTextField textField = new JTextField(20);
        textField.setToolTipText("Gib hier etwas ein!");

        JLabel label = new JLabel("Label");
        label.setToolTipText("Dies ist ein Label.");

        // ###############################################
        // # Schritt 2: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(button);
        frame.add(textField);
        frame.add(label);

        // ###################################################
        // # Schritt 3: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
