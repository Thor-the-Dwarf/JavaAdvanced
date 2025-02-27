package _3_Maven.Act_2_no_sql___durch_json.level_2._220_Die_Json_Collection.missionen;

import java.util.Scanner;

public class A220_JsonCollectionManipulator {
    private static final String PATH = "dein Pfad hier";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Neuen Eintrag hinzufügen (oder 'quit' zum Beenden): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Programm beendet.");
                break;
            }

            // todo Sorge dafür das in jeder iteration ein weiterer Eintrag in einer json-collection hinzugefügt wird
        }

        scanner.close();
    }
}

