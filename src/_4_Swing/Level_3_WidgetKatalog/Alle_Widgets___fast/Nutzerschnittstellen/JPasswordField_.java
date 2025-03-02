package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Nutzerschnittstellen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordField_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JPasswordField Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Passwortfelds
        // ###############################################
        JPasswordField passwordField = new JPasswordField(20);

        // Die häufig genutzten Attribute
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart
        passwordField.setEchoChar('*'); // Zeichen, das das Passwort verdeckt
        passwordField.setToolTipText("Geben Sie Ihr Passwort ein"); // Tooltip

        // ###############################################
        // # Schritt 2: Aktion hinzufügen, um das Passwort auszulesen
        // ###############################################
        JButton showPasswordButton = new JButton("Passwort anzeigen");
        showPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword();
                System.out.println("Eingegebenes Passwort: " + String.valueOf(password));
            }
        });

        // ###############################################
        // # Schritt 3: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(passwordField);
        frame.add(showPasswordButton);

        // ###################################################
        // # Schritt 4: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
