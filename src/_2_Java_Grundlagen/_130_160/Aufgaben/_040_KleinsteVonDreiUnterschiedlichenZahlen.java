package _2_Java_Grundlagen._130_160.Aufgaben;

import java.util.Random;

public class _040_KleinsteVonDreiUnterschiedlichenZahlen {

    public static void main(String[] args) {

        /*
         * Kleinste von drei UNTERSCHIEDLICHEN Zahlen
         *
         * Schreibe ein Programm,
         * das drei Variablen mit zufälligen,
         * UNTERSCHIEDLICHEN Zahlen (aus dem gleichen Zahlenraum) befüllt.
         * Dann soll das Programm testen,
         * welche der Zahlen die Kleinste ist und diese ausgeben.
         */




//                 * Schreibe ein Programm,
//         * das drei Variablen mit zufälligen,
        int zahl1 = 0, zahl2 = 0, zahl3 = 0;


//         * UNTERSCHIEDLICHEN Zahlen (aus dem gleichen Zahlenraum) befüllt.
        Random rnd = new Random();
        while (zahl1 == zahl2 || zahl2 == zahl3 || zahl3 == zahl1){
            zahl1 = rnd.nextInt(1,4);
            zahl2 = rnd.nextInt(1,4);
            zahl3 = rnd.nextInt(1,4);
        }
        System.out.println("zahl1= " + zahl1);
        System.out.println("zahl2= " + zahl2);
        System.out.println("zahl3= " + zahl3);

//        Dann soll das Programm testen,
//         * welche der Zahlen die Kleinste ist und diese ausgeben.
        if(zahl1 > zahl2 && zahl1 > zahl3)
            System.out.println(zahl1 + " ist die größte");
        else if(zahl2 > zahl1 && zahl2 > zahl3)
            System.out.println(zahl2 + " ist die größte");
        else
            System.out.println(zahl3 + " ist die größte");


    }
}
