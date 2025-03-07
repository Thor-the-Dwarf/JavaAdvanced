package _2_Java_Grundlagen._210_260;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _260_EnhancedFor {
    public static void main(String[] args) {
        // Beispiel mit einem Array
        System.out.println("Enhanced For-Loop mit einem Array:");
        int[] zahlenArray = {1, 2, 3, 4, 5};
        for (int zahl : zahlenArray) {
            System.out.println(zahl);
        }

        // Beispiel mit einer ArrayList
        System.out.println("\nEnhanced For-Loop mit einer ArrayList:");
        ArrayList<Integer> zahlenListe = new ArrayList<Integer>();
        zahlenListe.add(10);
        zahlenListe.add(20);
        zahlenListe.add(30);
        for (int zahl : zahlenListe) {
            System.out.println(zahl);
        }

        // Beispiel mit einer HashMap
        System.out.println("\nEnhanced For-Loop mit einer HashMap:");
        HashMap<String, Integer> kapitalStaedte = new HashMap<String, Integer>();
        kapitalStaedte.put("Deutschland", 1);
        kapitalStaedte.put("Frankreich", 2);
        kapitalStaedte.put("Spanien", 3);
        for (Map.Entry<String, Integer> eintrag : kapitalStaedte.entrySet()) {
            System.out.println("Schlüssel: " + eintrag.getKey() + ", Wert: " + eintrag.getValue());
        }
    }
}
