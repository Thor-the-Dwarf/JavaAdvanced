package _4_Swing.Level_2_EigeneWidgets;

import javax.swing.*;
import java.awt.*;

// Kindklasse: Child Frame
class MyChild extends JFrame {
    public MyChild(int number) {
        this.setTitle("Child " + number);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JLabel label = new JLabel("I am Child " + number);
        this.add(label);
    }
}
