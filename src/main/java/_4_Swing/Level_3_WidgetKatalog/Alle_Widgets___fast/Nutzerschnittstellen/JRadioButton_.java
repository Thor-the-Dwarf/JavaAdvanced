package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JRadioButton Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen von Radiobuttons
        // ###############################################
        JRadioButton radioButton1 = new JRadioButton("Option 1", true);
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        // Die häufig genutzten Attribute
        radioButton1.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton2.setFont(new Font("Arial", Font.PLAIN, 14));
        radioButton3.setFont(new Font("Arial", Font.PLAIN, 14));

        radioButton1.setBackground(Color.WHITE);
        radioButton2.setBackground(Color.WHITE);
        radioButton3.setBackground(Color.WHITE);

        // ###############################################
        // # Schritt 2: Gruppieren der Radiobuttons
        // ###############################################
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        // ###############################################
        // # Schritt 3: Aktion für die Radiobuttons hinzufügen
        // ###############################################
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton selectedButton = (JRadioButton) e.getSource();
                System.out.println("Ausgewählte Option: " + selectedButton.getText());
            }
        };
        radioButton1.addActionListener(actionListener);
        radioButton2.addActionListener(actionListener);
        radioButton3.addActionListener(actionListener);

        // ###############################################
        // # Schritt 4: Radiobuttons zum JFrame hinzufügen
        // ###############################################
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);

        // ###################################################
        // # Schritt 5: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
