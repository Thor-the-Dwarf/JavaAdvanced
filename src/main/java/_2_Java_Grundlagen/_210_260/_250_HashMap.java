package _2_Java_Grundlagen._210_260;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class _250_HashMap {

    public static void main(String[] args) {

        // HashMap
        // Python: Dictionary, PHP: Assoziative Array
        // Key-Value-Paare
        // Die Indexe sind eine Menge von Elementen (ungeordnet, einmalige Elemente)
        // SQL: vorname, nachname, alter, email

        HashMap<String, String> haupstaedte = new HashMap<>();

        // put()
        haupstaedte.put("Deutschland", "Berlin");
        haupstaedte.put("Italien", "Rom");
        haupstaedte.put("Frankreich", "Paris");
        haupstaedte.put("Spanien", "Madrid");
        System.out.println(haupstaedte);  // {Deutschland=Berlin, Frankreich=Paris, Spanien=Madrid, Italien=Rom}

        // size()
        System.out.println(haupstaedte.size());  // 4

        // get(key)
        System.out.println(haupstaedte.get("Italien"));  // Rom

        // value remove(key)
        System.out.println(haupstaedte.remove("Italien"));  // Rom
        haupstaedte.remove("Spanien");
        System.out.println(haupstaedte);  // {Deutschland=Berlin, Frankreich=Paris}

        // replace()
        System.out.println(haupstaedte.replace("Frankreich", null));  // Paris
        System.out.println(haupstaedte);  // {Deutschland=Berlin, Frankreich=null}
        haupstaedte.replace("Frankreich", "");
        System.out.println(haupstaedte);  // {Deutschland=Berlin, Frankreich=}
        haupstaedte.replace("Frankreich", "0");
        System.out.println(haupstaedte);  // {Deutschland=Berlin, Frankreich=0}
        haupstaedte.replace("Frankreich", "Paris");

        // keySet()
        // Gibt ein Set der Keys zurück
        System.out.println(haupstaedte.keySet());  // [Deutschland, Frankreich]
        Set<String> laender = haupstaedte.keySet();
        System.out.println(laender);  // [Deutschland, Frankreich]

        // for-Schleife bei HashMap
        for (String land : laender) {
            System.out.println(land + " -> " + haupstaedte.get(land));
        }
        for (String land : haupstaedte.keySet()) {
            System.out.println(land + " -> " + haupstaedte.get(land));
        }
        // Deutschland -> Berlin
        // Frankreich -> Paris

        // values()
        System.out.println(haupstaedte.values());  // [Berlin, Paris]
        Collection<String> staedte = haupstaedte.values();
        System.out.println(staedte);               // [Berlin, Paris]

        for (String stadt : haupstaedte.values()) {
            System.out.print(stadt + " ");  // Berlin Paris
        }
        System.out.println();

        // clear()
        haupstaedte.clear();
        System.out.println(haupstaedte);  // {}


    }
}
