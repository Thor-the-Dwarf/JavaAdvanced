package _4_Swing.Level_3_WidgetKatalog.Layouts;

import javax.swing.*;

public class GroupLayout_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("GroupLayout Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines GroupLayout-Managers
        // ###############################################
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Komponenten erstellen
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // ###############################################
        // # Schritt 2: Anordnung der Komponenten
        // ###############################################
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontale Gruppierung
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addComponent(button1);
        hGroup.addComponent(button2);
        hGroup.addComponent(button3);
        layout.setHorizontalGroup(hGroup);

        // Vertikale Gruppierung
        GroupLayout.ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
        vGroup.addComponent(button1);
        vGroup.addComponent(button2);
        vGroup.addComponent(button3);
        layout.setVerticalGroup(vGroup);

        // ###############################################
        // # Schritt 3: Panel zum JFrame hinzufügen
        // ###############################################
        frame.add(panel);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
