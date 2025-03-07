package _3_Maven.Act_2_no_sql___durch_json.level_2._230_JsonRecursion;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * ✅ **JsonRecursionService**
 *
 * Diese Klasse verwaltet eine **rekursive JSON-Hierarchie**, in der ein Dokument **Subcollections** enthalten kann.
 *
 * 🔹 **Speicherort:** `/Users/thor/Arbeit/Themen/Code/Java_02_2025/src/main/java/__meiner/json/level2/Json_documents`
 * 🔹 **Format:** JSON mit `org.json`-Bibliothek
 */
public class JsonRecursionService {
    private static final String PATH = "/Users/thor/Arbeit/Themen/Code/Java_02_2025/src/main/java/__meiner/json/level2/Json_documents";
    private String jsonDocumentName;

    public JsonRecursionService() {
        new File(PATH).mkdirs();
    }

    public File open(String jsonDocumentName) {
        this.jsonDocumentName = jsonDocumentName;
        File file = new File(PATH, jsonDocumentName + ".json");

        if (!file.exists()) {
            try {
                file.createNewFile();
                Files.write(file.toPath(), new JSONObject().put("subcollections", new JSONObject()).toString(4).getBytes());
            } catch (IOException e) {
                throw new RuntimeException("❌ Fehler beim Erstellen der JSON-Datei", e);
            }
        }
        return file;
    }

    public JSONObject readJsonDocument() {
        try {
            File file = new File(PATH, jsonDocumentName + ".json");
            if (!file.exists()) return new JSONObject();

            String content = new String(Files.readAllBytes(file.toPath()));
            return new JSONObject(content);
        } catch (IOException e) {
            throw new RuntimeException("❌ Fehler beim Lesen der JSON-Datei", e);
        }
    }

    public void addEntry(JSONObject newObject) {
        JSONObject document = readJsonDocument();
        JSONArray entries = document.optJSONArray("entries");
        if (entries == null) {
            entries = new JSONArray();
            document.put("entries", entries);
        }

        newObject.put("id", entries.length() + 1);
        entries.put(newObject);
        updateJsonDocument(document);
    }

    public void addSubcollectionEntry(String subcollectionName, JSONObject newObject) {
        JSONObject document = readJsonDocument();
        JSONObject subcollections = document.optJSONObject("subcollections");
        if (subcollections == null) {
            subcollections = new JSONObject();
            document.put("subcollections", subcollections);
        }

        JSONArray subcollection = subcollections.optJSONArray(subcollectionName);
        if (subcollection == null) {
            subcollection = new JSONArray();
            subcollections.put(subcollectionName, subcollection);
        }

        newObject.put("id", subcollection.length() + 1);
        subcollection.put(newObject);
        updateJsonDocument(document);
    }

    public void updateJsonDocument(JSONObject document) {
        try {
            File file = new File(PATH, jsonDocumentName + ".json");
            Files.write(file.toPath(), document.toString(4).getBytes());
        } catch (IOException e) {
            throw new RuntimeException("❌ Fehler beim Aktualisieren der JSON-Datei", e);
        }
    }

    public boolean deleteJsonFile() {
        File file = new File(PATH, jsonDocumentName + ".json");
        return file.exists() && file.delete();
    }

    public static void main(String[] args) {
        JsonRecursionService service = new JsonRecursionService();
        String fileName = "Test_Hierarchie";

        // 📂 **Öffnet oder erstellt die Haupt-Dokumentdatei**
        File file = service.open(fileName);
        System.out.println("📄 Datei geöffnet/erstellt: " + file.getAbsolutePath());

        // ➕ **Fügt einen Haupteintrag hinzu**
        JSONObject mainEntry = new JSONObject().put("name", "Hauptdokument").put("alter", 35);
        service.addEntry(mainEntry);
        System.out.println("✅ Hauptdokument hinzugefügt: " + mainEntry);

        // ➕ **Fügt eine Subcollection hinzu**
        JSONObject subEntry1 = new JSONObject().put("produkt", "Laptop").put("preis", 1200);
        service.addSubcollectionEntry("Bestellungen", subEntry1);
        System.out.println("✅ Subcollection-Eintrag hinzugefügt: " + subEntry1);

        JSONObject subEntry2 = new JSONObject().put("produkt", "Smartphone").put("preis", 800);
        service.addSubcollectionEntry("Bestellungen", subEntry2);
        System.out.println("✅ Weiterer Subcollection-Eintrag hinzugefügt: " + subEntry2);

        // 📖 **Liest das gesamte Dokument und zeigt es an**
        JSONObject document = service.readJsonDocument();
        System.out.println("📜 Gelesenes Dokument: " + document.toString(4));
    }
}