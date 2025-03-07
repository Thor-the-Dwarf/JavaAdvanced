package _2_Java_Grundlagen._210_260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _240_ArrayList {

    public static void main(String[] args) {

        // ArrayList
        // Die Größe ist veränderbar
        // Benutzung per Methoden
        // Nur ein Datentyp pro ArrayList
        // ArrayList extends AbstractList implements List, RandomAccess, Cloneable, java.io.Serializable
        // https://programmer.group/big-data-java-foundation-java-data-structure-14-listjava-arraylist.html

        // ArrayList actually uses an array to store elements.
        // Direct known Subclasses: AttributeList, RoleList, RoleUnresolvedList


        // ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums);  // []

        // add(element) - Hinzufügen
        nums.add(2);
        nums.add(7);
        nums.add(9);
        nums.add(11);
        System.out.println(nums);  // [2, 7, 9, 11]

        // add(index, element)
        nums.add(0, 7);  //
        System.out.println(nums);  // [7, 2, 7, 9, 11]

        // Enhanced for
        // for (int num : nums) {
        for (Integer num : nums) {
            System.out.print(num + " ");  // 7 2 7 9 11
        }
        System.out.println();

        // size()
        System.out.println(nums.size());  // 4

        // get(index)
        System.out.println(nums.get(3));  // 9

        // set(index, element)
        nums.set(0, 23);
        System.out.println(nums);  // [23, 2, 7, 9, 11]

        // indexOf(Object)
        // Ermittelt den Index (des ersten Fundes) eines Wertes
        System.out.println(nums.indexOf(9));  // 3
        // Rückgabewert, wenn es den Wert nicht gibt:
        System.out.println(nums.indexOf(999));  // -1

        // contains(Object o)
        // Testet, ob o in der ArrayList vorkommt
        System.out.println(nums.contains(9));        // true
        System.out.println(nums.contains(999));      // false
        System.out.println(nums.contains("Hello"));  // false
        System.out.println(nums.contains(22.0));     // false

        if (nums.indexOf(999) == -1) {
            System.out.println("Nicht da.");
        }

        // if (nums.contains(999) == false) {
        if (!nums.contains(999)) {
            System.out.println("Nicht da.");
        }

        // remove(index)
        // Die ArrayList wird neu indiziert
        // Der entfernte Wert wird zurück gegeben
        System.out.println(nums.get(3));           // 9
        System.out.println(nums);                  // [23, 2, 7, 9, 11]
        System.out.println(nums.remove(3));  // 9
        System.out.println(nums);                  // [23, 2, 7, 11]

        // remove(object)
        // Gibt true zurück, wenn es den zu enrferenden Wert gab (sonst false).
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Paul");
        namen.add("Mary");
        System.out.println(namen.remove("Paul"));  // true
        System.out.println(namen);  // [Peter, Mary]
        System.out.println(namen.remove("Paul"));  // false

        // remove(object) entfernt nur ersten Fund
        namen.add("Mary");
        System.out.println(namen);                    // [Peter, Mary, Mary]
        System.out.println(namen.remove("Mary"));  // true
        System.out.println(namen);                    // [Peter, Mary]

        // clear()
        namen.clear();
        System.out.println(namen);  // []

        // ArrayListen werden neu indiziert
        namen.add("Peter");
        namen.add("Paul");
        namen.add("Mary");

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(i + ". " + namen.get(i));
        }
        // 0. Peter
        // 1. Paul
        // 2. Mary

        namen.remove("Paul");

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(i + ". " + namen.get(i));
        }
        // 0. Peter
        // 1. Mary

        // remove(object) mit int
        nums.clear();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);                      // [1, 2, 3, 4]
        // Hier wird der Index entfernt
        System.out.println(nums.remove(2));      // 3
        System.out.println(nums);                      // [1, 2, 4]
        // Hier wird der Wert entfernt (ein Objekt muss übergeben werden)
        System.out.println(nums.remove((Integer) 1));  // true
        System.out.println(nums);                      // [2, 4]

        // List subList(start, ende)
        ArrayList<Integer> zahlen = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> zahlen2 = zahlen.subList(4, 7);
        System.out.println(zahlen2);  // [4, 5, 6]

        // addAll()
        ArrayList<Integer> zahlen3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> zahlen4 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println(zahlen3.addAll(zahlen4));  // true
        System.out.println(zahlen3);  // [1, 2, 3, 4, 5, 6]

        // Es muss der richtige Datentyp sein
        ArrayList<Double> aldou = new ArrayList<>();
        Integer int1 = 123;
//         aldou.add(int1);           // java: no suitable method found for add(int)
//         aldou.add(123);            // java: no suitable method found for add(int)
//         aldou.add((Integer) 123);  // java: no suitable method found for add(int)
//         aldou.add(123.0F);         // java: no suitable method found for add(int)
        aldou.add(123.0);


        // null kann man hinzufügen UND entfernen
        ArrayList<Integer> zahlen5 = new ArrayList<>();
        zahlen5.add(1);
        zahlen5.add(null);
        zahlen5.add(2);
        System.out.println(zahlen5);  // [1, null, 2]
        zahlen5.remove(null);
        System.out.println(zahlen5);  // [1, 2]


    }
}
