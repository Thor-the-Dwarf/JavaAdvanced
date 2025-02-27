package _2_Java_Grundlagen._010_080.Aufgaben;

public class _010_While_Aufgaben {

    public static void main(String[] args) {

        /* 1.
         * Schreibe eine while-Schleife, die Folgendes ausgibt:
         * 100 90 80 70 60 50 40 30 20 10
         */
//
//        int ausgabezahl = 100;
//        int i = 0;
//        while (i < 10){
//            System.out.print((ausgabezahl -=10) + " ");
//            i++;
//        }


        /* 2.
         * Schreibe eine while-Schleife, die Folgendes ausgibt:
         * 2000 3000 4000 5000 6000
         */


        /* 3.
         * Schreibe eine while-Schleife, die Folgendes ausgibt:
         * 2.0 1.5 1.0 0.5 0.0 -0.5 -1.0
         */



        double ausgabezahl = 2.0;
        int i = 0;
        while (i < 7){
            System.out.print((ausgabezahl -=0.5) + " ");
            i++;
        }
    }
}
