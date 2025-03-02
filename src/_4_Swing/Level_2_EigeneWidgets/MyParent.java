package _4_Swing.Level_2_EigeneWidgets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

// Elternklasse: Parent Frame
public class MyParent extends JFrame {
    private int childCount = 0; // Zähler für Child-Frames
    private final ArrayList<MyChild> children = new ArrayList<>(); // Liste der Child-Frames

    public MyParent() {

        // Hauptfenster konfigurieren
        this.setTitle("Parent Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());


        // Button zum Erstellen eines neuen Child-Frames
        JButton createButton = new JButton("Create Child");
        createButton.addActionListener(this::createChild);
        this.add(createButton);


        // Button zum Schließen des letzten Child-Frames
        JButton deleteButton = new JButton("Delete Last Child");
        deleteButton.addActionListener(this::deleteLastChild);
        this.add(deleteButton);


        this.setVisible(true);
    }


    private void createChild(ActionEvent e) {
        childCount++;
        MyChild child = new MyChild(childCount);
        children.add(child);
        child.setVisible(true);
    }


    private void deleteLastChild(ActionEvent e) {
        if (!children.isEmpty()) {
            MyChild lastChild = children.remove(children.size() - 1);
            lastChild.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No more children to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
