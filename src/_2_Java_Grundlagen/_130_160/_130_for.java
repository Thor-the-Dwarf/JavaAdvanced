package _2_Java_Grundlagen._130_160;

public class _130_for {

    public static void main(String[] args) {

        // for Schleife
        // Zählschleife
        // Kopfgesteuert
        // for (Initialisierung (start); Bedingung; Iteration (Veränderung))

//        while () {
//            System.out.print(i + " ");
//
//        }
//
//        for (int i = 0; i < 10; i++)



        for (int i = 0; i < 10; i += 2) {
            System.out.print("Hello ");  // Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello
        }

//        // Mit der Benutzung von i
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");  // 0 1 2 3 4 5 6 7 8 9
//        }
//        System.out.println();
//
//        // Endlos-Schleife
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");  // 0 0 0 0 0 ....
            i--;
        }
//        System.out.println();


    }
}
