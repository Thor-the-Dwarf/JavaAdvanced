package _4_Swing.Level_3_WidgetKatalog.Layouts;

import javax.swing.*;
import java.awt.*;

public class CardLayout_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("CardLayout Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // ###############################################
        // # Schritt 1: Erstellen eines CardLayout-Managers
        // ###############################################
        // Das CardLayout erlaubt das Stapeln von Komponenten wie Karten,
        // bei denen immer nur eine sichtbar ist.
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // ###############################################
        // # Schritt 2: Hinzufügen von Karten zum CardLayout
        // ###############################################

        // Erstellen von Panels als Karten
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Dies ist Karte 1"));
        card1.setBackground(Color.LIGHT_GRAY);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Dies ist Karte 2"));
        card2.setBackground(Color.CYAN);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Dies ist Karte 3"));
        card3.setBackground(Color.ORANGE);

        // Karten zum CardLayout hinzufügen
        cardPanel.add(card1, "Karte 1");
        cardPanel.add(card2, "Karte 2");
        cardPanel.add(card3, "Karte 3");

        // CardPanel zum JFrame hinzufügen
        frame.add(cardPanel);

        // ###############################################
        // # Schritt 3: Wechseln zwischen den Karten
        // ###############################################
        // Steuerung zum Wechseln der Karten hinzufügen
        JPanel buttonPanel = new JPanel();
        JButton btnNext = new JButton("Nächste Karte");
        JButton btnPrev = new JButton("Vorherige Karte");

        btnNext.addActionListener(e -> cardLayout.next(cardPanel));
        btnPrev.addActionListener(e -> cardLayout.previous(cardPanel));

        buttonPanel.add(btnPrev);
        buttonPanel.add(btnNext);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}

