package _4_Swing.Level_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _040_EingabeDatenAuslesen {

    public static void main(String[] args) {

        // Hauptfenster erstellen
        JFrame frame = new JFrame("Erweiterte Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 1)); // 6 Zeilen, 1 Spalte

        // Eingabefeld erstellen
        JTextField textField = new JTextField("Gib etwas ein");
        frame.add(textField);

        // Label zur Anzeige des aktuellen Texts
        JLabel displayLabel = new JLabel("Noch kein Text eingegeben", SwingConstants.CENTER);
        frame.add(displayLabel);

        // ###############################################
        // # Button 1: Private Klasse, die ActionListener implementiert
        // ###############################################
        JButton button1 = new JButton("Private Klasse");
        button1.addActionListener(new PrivateActionListener(textField, displayLabel));
        frame.add(button1);

        // ###############################################
        // # Button 2: ActionListener-Objekt überschreiben
        // ###############################################
        JButton button2 = new JButton("Überschriebenes Objekt");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(textField.getText());
            }
        });
        frame.add(button2);

        // ###############################################
        // # Button 3: Lambda mit einzeiliger Funktion
        // ###############################################
        JButton button3 = new JButton("Lambda (einzeilig)");
        button3.addActionListener(e -> displayLabel.setText(textField.getText()));
        frame.add(button3);

        // ###############################################
        // # Button 4: Lambda mit mehrzeiliger Funktion
        // ###############################################
        JButton button4 = new JButton("Lambda (mehrzeilig)");
        button4.addActionListener(e -> {
            String text = textField.getText();
            displayLabel.setText("Eingegebener Text: " + text);
        });
        frame.add(button4);

        // ###############################################
        // # Button 5: Methode referenzieren
        // ###############################################
        JButton button5 = new JButton("Methodenreferenz");
        button5.addActionListener(e -> updateLabel(textField, displayLabel));
        frame.add(button5);

        // Fenster sichtbar machen
        frame.setVisible(true);
    }

    // ###############################################
    // # Button 1: Private Klasse, die ActionListener implementiert
    // ###############################################
    private static class PrivateActionListener implements ActionListener {
        private final JTextField textField;
        private final JLabel label;

        public PrivateActionListener(JTextField textField, JLabel label) {
            this.textField = textField;
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText(textField.getText());
        }
    }

    // ###############################################
    // # Button 5: Methode referenzieren
    // ###############################################
    private static void updateLabel(JTextField textField, JLabel label) {
        label.setText(textField.getText());
    }
}
