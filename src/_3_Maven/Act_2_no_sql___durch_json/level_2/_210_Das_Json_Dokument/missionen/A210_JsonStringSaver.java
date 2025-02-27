package _3_Maven.Act_2_no_sql___durch_json.level_2._210_Das_Json_Dokument.missionen;

import java.util.Scanner;

public class A210_JsonStringSaver {
    private static final String PATH = "strings.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Gib einen String ein (oder 'quit' zum Beenden): ");
            String input = scanner.nextLine();
            System.out.println(input + " wurde eingegeben");

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Programm beendet.");
                break;
            }
            // todo sorge dafür das der eingegebene String in einer JSON-Datei gespeichert wird

        }

        scanner.close();
    }


}

