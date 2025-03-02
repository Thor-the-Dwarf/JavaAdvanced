package _4_Swing.Level_4_Widget_Kommunikation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Child_ extends JPanel {

    private final JLabel label;
    private final String text;

    // ###############################################
    // # Schritt 1: Konstruktor erstellen
    // ###############################################
    public Child_(String text, Callback callback) {
        this.text = text;

        // ###############################################
        // # Schritt 2: Layout und Label erstellen
        // ###############################################
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel(text);
        add(label);

        // ###############################################
        // # Schritt 3: Button zum Benachrichtigen
        // ###############################################
        JButton notifyButton = new JButton("Notify Parent");
        add(notifyButton);

        // ###############################################
        // # Schritt 4: ActionListener für den Button
        // ###############################################
        notifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                callback.onMessageReceived(text + " Irgendwas anderes");
            }
        });
    }

    // ###############################################
    // # Schritt 5: Nachricht vom Parent empfangen
    // ###############################################
    public void receiveMessageFromParent(String newText) {
        label.setText(text + " " + newText);
    }

    // ###############################################
    // # Schritt 6: Interface für Callback
    // ###############################################
    @FunctionalInterface
    public interface Callback {
        void onMessageReceived(String message);
    }

    // ###############################################
    // # Schritt 7: main() zur Anzeige eines einzelnen Childs
    // ###############################################
    public static void main(String[] args) {
        // ###############################################
        // # Schritt 7.1: Test-Frame erstellen
        // ###############################################
        JFrame frame = new JFrame("Child-Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        // ###############################################
        // # Schritt 7.2: Child-Komponente hinzufügen
        // ###############################################
        Child_ child = new Child_("Child 1", message -> System.out.println("Nachricht vom Child: " + message));
        frame.add(child, BorderLayout.CENTER);

        // ###############################################
        // # Schritt 7.3: Fenster sichtbar machen
        // ###############################################
        frame.setVisible(true);
    }
}
