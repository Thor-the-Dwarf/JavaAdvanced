package _3_Maven.Act_2_no_sql___durch_json.level_1.missionen;

import java.util.ArrayList;
import java.util.List;
import _3_Maven.Act_2_no_sql___durch_json.level_1.Person;



public class B010_Pseudodatenbank {
    public static void main(String[] args) {
        PseudoDatenbank pseudoDatenbank = new PseudoDatenbank();
        for(Person p : pseudoDatenbank.getPersonen())
            System.out.println(p);
    }
}

/**Das hier ist eine Pseudodatenbank*/
class PseudoDatenbank {

    private final List<Person> personen;

    // Konstruktor mit festgelegten Daten
    public PseudoDatenbank() {
        personen = new ArrayList<>();
        personen.add(new Person("Max Mustermann", 30, false));
        personen.add(new Person("Anna Schmidt", 25, true));
        personen.add(new Person("Lukas Weber", 40, false));
        personen.add(new Person("Clara Meier", 22, true));
        personen.add(new Person("Tim Schulz", 35, false));
        personen.add(new Person("Sophie Wagner", 28, true));
        personen.add(new Person("Julian Becker", 50, false));
        personen.add(new Person("Lisa Hoffmann", 32, true));
        personen.add(new Person("Tom Berger", 45, false));
        personen.add(new Person("Emma Krause", 29, true));
    }

    // Getter für die Personenliste
    public List<Person> getPersonen() {
        return personen;
    }
}


/**
 * 🎯 **Mission: Erstelle deine eigene Pseudo-Datenbank!**
 *
 * In vielen Entwicklungsprojekten werden **Pseudodatenbanken** genutzt,
 * um in frühen Entwicklungsphasen mit Testdaten zu arbeiten.
 * Sie simulieren eine echte Datenbank, aber ohne externe Abhängigkeiten.
 *
 * 🛠 **Deine Aufgabe:**
 * - Erstelle eine eigene Klasse **`MeinePseudoDatenbank`**.
 * - Diese Klasse soll eine `List<T>` enthalten, wobei **T eine selbst definierte Datenklasse** ist.
 * - Deine Datenklasse darf **keine Person sein**, sondern ein eigenes Objekt (z. B. `Auto`, `Buch`, `Produkt`).
 * - Befülle die Liste mit mindestens **5 individuellen Objekten**.
 * - Implementiere eine Methode `getDaten()`, die die Liste zurückgibt.
 *
 * 📌 **Zusatzaufgabe:**
 * - Schreibe eine `main()`-Methode, die die Objekte aus deiner Datenbank ausgibt.
 * - Optional: Nutze eine Schleife, um alle Einträge auf der Konsole anzuzeigen.
 *
 * 🚀 **Ziel:** Verstehe, wie man eine **einfache Datenbank-Simulation** mit Java erstellt!
 */
