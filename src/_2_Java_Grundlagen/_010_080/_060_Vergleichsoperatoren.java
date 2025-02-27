package _2_Java_Grundlagen._010_080;

public class _060_Vergleichsoperatoren {

    public static void main(String[] args) {

        System.out.println("Vergleichsoperatoren / Boolische Operatoren == != < > <= >=");
        // Ein Ausdruck mit einem Vergleichsoperator evaluiert immer zu einem Boolean.

        System.out.println(3 == 4);     // false
        System.out.println(3 != 4);  // true
        System.out.println(3 < 4);  // true
        System.out.println(3 > 4);  // false
        System.out.println(4 <= 4);  // true
        System.out.println(4 >= 4);  // true

        // Alle numerischen Typen können mit vergleichsoperatoren verglichen werden.
        // Der Integer wird impliziet zum Float gecastet:

        System.out.println(3 == 3.0);  // true
        System.out.println(3 == 'A');  // false
        System.out.println(65 == 'A');  // true
//        System.out.println(3 == "3.0");  // Fehler
//        System.out.println(3 == true);  // Fehler

    }
}
