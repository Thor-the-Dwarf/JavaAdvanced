
/**
 * 🔧 Maven-Abhängigkeiten neu laden und aktualisieren
 * <p>
 * 0️⃣ **JSON-Abhängigkeit in die pom.xml hinzufügen**:
 * Bevor Maven die org.json-Bibliothek herunterladen kann, muss folgende Dependency in der `pom.xml` eingetragen werden:
 */
// Quelle: https://mvnrepository.com/artifact/org.json/json
//        <dependency>
//                <groupId>org.json</groupId>
//                <artifactId>json</artifactId>
//                <version>20250107</version>
//        </dependency>


/**
 * ✔️ Diese Zeilen müssen innerhalb des `<dependencies>`-Tags stehen.
 *
 * --------------------------------------------
 *
 * 1️⃣ **Abhängigkeiten neu laden**:
 * Falls die Abhängigkeiten nicht automatisch heruntergeladen werden, führe folgenden Befehl aus:
 *
 *     mvn clean install
 *
 * ✔️ Dieser Befehl löscht alte Build-Dateien und lädt alle Abhängigkeiten neu.
 *
 * --------------------------------------------
 *
 * 2️⃣ **Maven zwingen, Abhängigkeiten zu aktualisieren**:
 * Falls weiterhin Fehler auftreten oder alte Versionen verwendet werden, kannst du ein forciertes Update durchführen:
 *
 *     mvn clean install -U
 *
 * ✔️ Das erzwingt ein Update aller Abhängigkeiten aus dem Maven-Repository.
 *
 * --------------------------------------------
 *
 * 3️⃣ **Lokalen Maven-Cache löschen (falls nichts hilft)**:
 * Falls Maven weiterhin Probleme hat, kannst du den Cache für die org.json-Bibliothek löschen
 * und anschließend alle Abhängigkeiten neu installieren:
 *
 *     rm -rf ~/.m2/repository/org/json
 *     mvn clean install
 *
 * ✔️ Dadurch wird der Cache gelöscht und die Abhängigkeiten frisch heruntergeladen.
 */


/**
 *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*
 *                                              Nur für intelliJ/Eclipse
 *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*
 *
 * 1️⃣ Maven-Abhängigkeiten werden neu geladen
 * 🔹 IntelliJ/Eclipse ruft intern diesen Befehl aus:
 *
 *     mvn clean dependency:resolve
 *
 * ✔ Das erzwingt das erneute Herunterladen ALLER Abhängigkeiten
 *   (auch wenn Maven glaubt, sie seien schon da).
 * ✔ Vergleichbar mit `mvn clean install -U`, aber IDE-spezifisch angepasst.
 *
 * -----------------------------------------------------------
 *
 * 2️⃣ IntelliJ/Eclipse löscht alte Caches für Abhängigkeiten
 * 🔹 Die IDE verwaltet einen internen Dependency-Cache, der von Maven unabhängig ist.
 * ✔ Beim "Maven Reload" leert die IDE diesen Cache und lädt die Abhängigkeiten wirklich neu.
 * ✔ Das verhindert "Geisterprobleme" mit nicht gefundenen Klassen wie `JSONObject`.
 *
 * 🚀 In der Konsole kannst du das so nachbilden:
 *
 *     mvn idea:clean
 *
 * (Aber das funktioniert nur, wenn das `maven-idea-plugin` installiert ist.)
 *
 * -----------------------------------------------------------
 *
 * 3️⃣ IntelliJ/Eclipse synchronisiert das `.iml`-Projektfile
 * 🔹 Java-Projekte in IntelliJ/Eclipse haben zusätzliche Projektdateien (`.iml`, `.classpath`).
 * ✔ Beim "Maven Reload" werden diese neu generiert, damit IntelliJ/Eclipse die Dependency-Struktur richtig erkennt.
 * ✔ Ohne das kann es sein, dass der Code nicht auf die Abhängigkeiten zugreifen kann, obwohl Maven sie kennt.
 *
 * 🚀 In der Konsole kannst du das teilweise so nachbilden:
 *
 *     mvn idea:idea
 *
 * Aber das funktioniert nicht perfekt in jeder IDE.
 *
 * -----------------------------------------------------------
 *
 * 4️⃣ Falls sich die `pom.xml` geändert hat, wird das Projekt neu gebaut
 * 🔹 Falls die `pom.xml` geändert wurde, baut die IDE das Projekt intern mit:
 *
 *     mvn compile
 *
 * ✔ Das überprüft, ob alle Abhängigkeiten jetzt gefunden werden.
 */


package _3_Maven.Act_2_no_sql___durch_json.level_1;
import org.json.JSONObject;

public class _020_JsonObject {
    public static void main(String[] args) {
//        _jsonPut();
//        _jsonGet();
//        _jsonMitDatenKlasse();
    }


    private static void _jsonPut() {
        System.out.println("_jsonPut()");


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Max");
        jsonObject.put("alter", 25);

        // JSON als String ausgeben (entspricht JSON.stringify in JS)
        String jsonString = jsonObject.toString();
        System.out.println(jsonString); // {"name":"Max","alter":25}

        // Optional: Schön formatierte Ausgabe mit Einrückungen
        String prettyJsonString = jsonObject.toString(1);
        System.out.println(prettyJsonString);
        System.out.println();
        System.out.println();
        System.out.println();
    }


    private static void _jsonGet() {
        System.out.println("_jsonGet()");
        String jsonString =
                "{ " +
                    "\"name\": \"Max\", " +
                    "\"alter\": 25, " +
                    "\"weiblich\": true " +
                "}";

        JSONObject obj = new JSONObject(jsonString);

        String name = obj.getString("name");

        System.out.println(obj.getString("name"));  //  Ausgabe: Max
        System.out.println(obj.getInt("alter"));    //  Ausgabe: 25
        System.out.println(obj.getBoolean("weiblich")); //  Ausgabe: true
        System.out.println();
        System.out.println();
        System.out.println();
    }


    private static void _jsonMitDatenKlasse() {
        System.out.println("_jsonMitDatenKlasse()");

        // 1️⃣ Erstelle eine Person
        Person person = new Person("Anna", 30, false);

        // 2️⃣ Konvertiere sie in JSON
        JSONObject jsonObject = person.toJson();
        System.out.println(jsonObject.toString(4));

        // 3️⃣ Konvertiere JSON zurück in eine Person
        Person person2 = Person.fromJson(jsonObject);

        // 4️⃣ Ausgabe
        System.out.println(person2);
    }
}