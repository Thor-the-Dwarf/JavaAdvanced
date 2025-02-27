package _2_Java_Grundlagen._170_200.Aufgaben;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class _100_Begruessung {

    public static void main(String[] args) {

//        /*
//         * Begrüßung
//         *
//         * Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit
//         * ausgegeben werden.
//         * Zwischen 22Uhr und 5Uhr: Gute Nacht
//         * Vor 11Uhr: Guten Morgen
//         * Vor 15Uhr: Mahlzeit
//         * Vor 18Uhr: Guten Nachmittag
//         * Vor 22Uhr: Guten Abend
//         *
//         * Die Stunde per Random zwischen 0 - 23 erstellen.
//         */




//        int rndStunde = 15;
//        System.out.println(data.get(rndStunde));

//        run();

        simulateDatabaseQuery(6).thenAccept(System.out::println);


    }

    static CompletableFuture<String> simulateDatabaseQuery(int value) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Das ist eine Simulation einer Datenbankabfrage");

            Map<Integer, String> data = new HashMap<>();
            data.put(0, "Gute Nacht");
            data.put(6, "Guten Morgen");
            data.put(12, "Mahlzeit");
            data.put(15, "Guten Nachmittag");
            data.put(18, "Guten Abend");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            return data.getOrDefault(value, "Keine passende Begrüßung gefunden");
        });
    }




    static void run() {
        int stundenCounter = 0;
        while (++stundenCounter < 24) {
//         * Zwischen 22Uhr und 5Uhr: Gute Nacht
            if (stundenCounter >= 22 || stundenCounter <= 5) {
                System.out.println(stundenCounter);
                System.out.println("Gute Nacht");
            }
//         * Vor 11Uhr: Guten Morgen
            else if (stundenCounter < 11) {
                System.out.println(stundenCounter);
                System.out.println("Guten Morgen");
            }
//         * Vor 15Uhr: Mahlzeit
            else if (stundenCounter < 15) {
                System.out.println(stundenCounter);
                System.out.println("Mahlzeit");
            }
//         * Vor 18Uhr: Guten Nachmittag
            else if (stundenCounter < 18) {
                System.out.println(stundenCounter);
                System.out.println("Guten Nachmittag");
            }
//         * Vor 22Uhr: Guten Abend
            else if (stundenCounter < 22) {
                System.out.println(stundenCounter);
                System.out.println("Guten Abend");
            }
        }
    }
}

