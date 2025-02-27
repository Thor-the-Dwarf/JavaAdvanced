package _2_Java_Grundlagen._270_300.Aufgaben;//package _270_300.Aufgaben;

public class _110_Nettopreis {

    public static void main(String[] args) {

        /*
         * Nettopreis
         *
         * Schreibe Methoden zum Berechnen des Nettopreises.
         * Den Methoden soll der Bruttopreis übergeben werden
         * und sie sollen den Nettopreis zurück geben.
         * Der Mehrwertsteuersatz soll als zweiter Parameter
         * übergeben werden können.
         * Der Standardwert des Mehrwertsteuersatzes soll 19 sein.
         * Der Algorithmus zum Berechnen des Nettopreises soll nur in einer Methode vorkommen.
         */

         System.out.println(berechneNettoPreis(116, 16));  // 100.0
         System.out.println(berechneNettoPreis(119));      // 100.0
    }


    static double berechneNettoPreis(int bruttopreis, int mehrwertsteuersatz){
        double nettoPreis = bruttopreis / (100 + mehrwertsteuersatz) * 100;
        return nettoPreis;
    }

    static double berechneNettoPreis(int bruttopreis){
        double nettoPreis = berechneNettoPreis(bruttopreis, 19);
        return nettoPreis;
    }
}
