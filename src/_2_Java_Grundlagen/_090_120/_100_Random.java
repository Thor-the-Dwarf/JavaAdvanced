package _2_Java_Grundlagen._090_120;


import java.util.Random;

public class _100_Random {

    public static void main(String[] args) {
        Random random = new Random();

//        // Erzeugt eine zufällige Ganzzahl
//        int zufallsZahl = random.nextInt();
//        System.out.println("Zufällige Ganzzahl: " + zufallsZahl);
//
//        // Erzeugt eine zufällige Ganzzahl zwischen 0 (inklusive) und 100 (exklusive)
//        int zufallsZahlBis100 = random.nextInt(100);
//        System.out.println("Zufällige Ganzzahl zwischen 0 und 99: " + zufallsZahlBis100);
//
//        // Erzeugt eine zufällige Ganzzahl zwischen 1 und 6
//        int wuerfel = random.nextInt(1, 7);
//        System.out.println("die Zahl auf dem Würfel ist: " + wuerfel);
//
//        // Erzeugt eine zufällige Fließkommazahl zwischen 0.0 und 1.0
        double zufallsFloat = random.nextDouble();
        System.out.println("Zufällige Fließkommazahl: " + zufallsFloat);
    }
}
