package _4_Swing.Level_4_Widget_Kommunikation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Parent_ extends JFrame {

    // ###############################################
    // # Schritt 1: Attribute und Konstruktor
    // ###############################################
    private final ArrayList<Child_> childrenWidgets = new ArrayList<>();
    private int childCounter = 0;

    private final JPanel childSpace; // Panel für Child-Komponenten
    private final JLabel messageLabel; // Label zur Anzeige von Nachrichten vom Child

    public Parent_() {
        // ###############################################
        // # Schritt 2: Hauptfenster erstellen
        // ###############################################
        setTitle("Parent-Komponenten Kommunikation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        // ###############################################
        // # Schritt 3: Panel für Child-Komponenten
        // ###############################################
        childSpace = new JPanel();
        childSpace.setLayout(new BoxLayout(childSpace, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(childSpace);
        add(scrollPane, BorderLayout.CENTER);

        // ###############################################
        // # Schritt 4: Nachrichten-Label hinzufügen
        // ###############################################
        messageLabel = new JLabel("Noch keine Nachricht");
        add(messageLabel, BorderLayout.NORTH);

        // ###############################################
        // # Schritt 5: Buttons hinzufügen
        // ###############################################
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Komponente hinzufügen");
        JButton notifyButton = new JButton("Notify All Children");

        addButton.addActionListener(e -> addChild());
        notifyButton.addActionListener(e -> notifyAllChildren());

        buttonPanel.add(addButton);
        buttonPanel.add(notifyButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // ###############################################
        // # Schritt 6: Fenster sichtbar machen
        // ###############################################
        setVisible(true);
    }

    // ###############################################
    // # Schritt 7: Nachricht vom Child empfangen
    // ###############################################
    public void receiveMessageFromChild(String message) {
        messageLabel.setText(message);
    }

    // ###############################################
    // # Schritt 8: Neues Child hinzufügen
    // ###############################################
    private void addChild() {
        childCounter++;
        Child_ child = new Child_(
                "Child " + childCounter,
                this::receiveMessageFromChild // Übergabe der Parent-Methode als Callback
        );
        childSpace.add(child);
        childSpace.revalidate();
        childSpace.repaint();
        childrenWidgets.add(child);
    }

    // ###############################################
    // # Schritt 9: Alle Kinder benachrichtigen
    // ###############################################
    private void notifyAllChildren() {
        for (Child_ child : childrenWidgets) {
            child.receiveMessageFromParent("Updated by Parent!");
        }
    }

    // ###############################################
    // # Schritt 10: main() zur Anzeige des Parents
    // ###############################################
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Parent_::new);
    }
}
