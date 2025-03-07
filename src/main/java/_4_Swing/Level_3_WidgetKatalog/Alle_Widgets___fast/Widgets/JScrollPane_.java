package _4_Swing.Level_3_WidgetKatalog.Alle_Widgets___fast.Widgets;

import javax.swing.*;

public class JScrollPane_ {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextArea textArea = new JTextArea("Dies ist ein sehr langer Text.\n".repeat(20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
