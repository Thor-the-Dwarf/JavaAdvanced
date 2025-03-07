package _2_Java_Grundlagen._170_200;

public class _170_OperatorenRangfolge {

    public static void main(String[] args) {

        // Operatoren precedence
        // https://introcs.cs.princeton.edu/java/11precedence/

        // Punkt- vor Strichrechnung
        System.out.println(3 + 4 * 5);    // 23
        System.out.println(3 * (4 + 5));  // 27

        // Klammern haben eine höhere Priorität als sowohl Punkt- als auch Strichrechnung
        System.out.println((3 + 4) * 5);  // 35

        // AND - OR
        // Erst AND dann OR
        System.out.println(true && false || true);    // true
        System.out.println((true && false) || true);  // true
        System.out.println(false || true);            // true

        System.out.println(true && false || false || true && true || false && true);        // true
        System.out.println((true && false) || false || (true && true) || (false && true));  // true
        System.out.println(false || false || true || false);                                // true

        // String-Verkettung
        System.out.println("test" + 7 * 8);    // test56
        System.out.println("test" + (7 * 8));  // test56
        System.out.println("test" + 56);       // test56

        System.out.println("test" + 7 + 8);    // test78
        System.out.println(("test" + 7) + 8);  // test78
        System.out.println(("test7") + 8);     // test78

    }
}
