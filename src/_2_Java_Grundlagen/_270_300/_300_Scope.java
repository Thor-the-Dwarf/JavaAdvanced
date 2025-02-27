package _2_Java_Grundlagen._270_300;

public class _300_Scope {

    public static void main(String[] args) {

        // Scope - Gültigkeitsbereich
        // Variablen aus einem größeren Scope sind im kleineren Scope sichtbar,
        // aber NICHT umgekehrt

        int x = 23;

        {
            System.out.println(x);  // 23
            int y = 42;
            System.out.println(y);  // 42
        }
//         System.out.println(y);  // cannot find symbol

        for (int i = 0; i < 5; i++) {
            int c = 0;
            System.out.print(i + " ");
        }
//        System.out.println(c);  // cannot find symbol
//        System.out.println(i);  // cannot find symbol

        int j;
        int c = 0;
        for (j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
        System.out.println(j);

        int a = 7;
        {
            // int a = 9;  // variable a is already defined
        }

        // Prüfungshumor
        int b = 4;
        if (b == 4) {
            System.out.print("Hello");
        }
        {
            System.out.print("World");
        }
        System.out.println("!");

        // Besser strukturiert
        if (b == 4) {
            System.out.print("Hello");
        }

        {
            System.out.print(" World");
        }

        System.out.println("!");

        // Variante mit else
        if (b == 4) {
            System.out.print("Hello");
        } else {
            System.out.print(" World");
        }
        System.out.println("!");


    }
}
