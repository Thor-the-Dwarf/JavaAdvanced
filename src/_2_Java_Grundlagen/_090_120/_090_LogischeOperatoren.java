package _2_Java_Grundlagen._090_120;

public class _090_LogischeOperatoren {

    public static void main(String[] args) {

        // Logische Operatoren
        // &&, ||, ^, !

//        System.out.println("&& - UND (sowohl als auch)");
//        System.out.println(3 >= 2 && 7 != 9);      // true
//        System.out.println((3 >= 2) && (7 != 9));  // true

        int zahl1 = 10;
        int zahl2 = 10;
        System.out.println((--zahl1 == 10) && (--zahl2 == 10));
        System.out.println(zahl1 + " " + zahl2);


        // Nur true, wenn beide true sind
        System.out.println(true && true);     // true
        System.out.println(false && true);    // false
        System.out.println(true && false);    // false
        System.out.println(false && false);   // false


        System.out.println("|| - oder");
        // Nur false, wenn beide false sind
        System.out.println(true || true);     // true
        System.out.println(false || true);    // true
        System.out.println(true || false);    // true
        System.out.println(false || false);   // false


        System.out.println("^ - Entweder-Oder XOR");
        // nur einer darf true sein
        System.out.println(true ^ true);     // false  !!! Unterschied zu ||
        System.out.println(false ^ true);    // true
        System.out.println(true ^ false);    // true
        System.out.println(false ^ false);   // false


        System.out.println("! NICHT (not)");
        //  dreht den Boolean um
        System.out.println(!(1 == 1));  // false
        System.out.println(!true);      // false
        System.out.println(!false);     // true

    }
}
