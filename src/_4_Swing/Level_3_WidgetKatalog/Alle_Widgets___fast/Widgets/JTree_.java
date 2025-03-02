package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTree_ {

    public static void main(String[] args) {
        // Erstellen des Hauptfensters (JFrame)
        JFrame frame = new JFrame("JTree Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // ###############################################
        // # Schritt 1: Erstellen eines Baums
        // ###############################################
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Parent 1");
        DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Parent 2");

        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        parent1.add(child1);
        parent1.add(child2);
        root.add(parent1);
        root.add(parent2);

        JTree tree = new JTree(root);

        // Die häufig genutzten Attribute
        tree.setFont(new Font("Arial", Font.PLAIN, 14)); // Schriftart
        tree.setShowsRootHandles(true); // Wurzelgriff anzeigen
        tree.setEditable(false); // Nicht bearbeitbar

        // ###############################################
        // # Schritt 2: Baum in ein JScrollPane einfügen
        // ###############################################
        JScrollPane scrollPane = new JScrollPane(tree);

        // ###############################################
        // # Schritt 3: Aktion hinzufügen, um die Auswahl anzuzeigen
        // ###############################################
        JButton showSelectionButton = new JButton("Auswahl anzeigen");
        showSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TreePath selectedPath = tree.getSelectionPath();
                if (selectedPath != null) {
                    System.out.println("Ausgewählte Node: " + selectedPath.getLastPathComponent());
                } else {
                    System.out.println("Keine Node ausgewählt.");
                }
            }
        });

        // ###############################################
        // # Schritt 4: Komponenten zum JFrame hinzufügen
        // ###############################################
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(showSelectionButton, BorderLayout.SOUTH);

        // ###################################################
        // # Schritt 5: JFrame sichtbar machen
        // ###################################################
        frame.setVisible(true);
    }
}
