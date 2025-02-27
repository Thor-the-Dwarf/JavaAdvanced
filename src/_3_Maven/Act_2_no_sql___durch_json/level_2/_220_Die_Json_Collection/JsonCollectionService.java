package _3_Maven.Act_2_no_sql___durch_json.level_2._220_Die_Json_Collection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * ✅ **JsonCollectionService**
 *
 * Diese Klasse verwaltet eine JSON-Collection und ermöglicht das **Erstellen**, **Lesen**, **Aktualisieren** und **Löschen**.
 * Zudem sorgt sie für eine automatische **ID-Vergabe** (Auto-Increment) und verhindert doppelte Einträge.
 *
 * 🔹 **Speicherort:** `/Users/thor/Arbeit/Themen/Code/Java_02_2025/src/main/java/__meiner/json/level2/Json_documents`
 * 🔹 **Format:** JSON-Array mit `org.json`-Bibliothek
 */
public class JsonCollectionService {
    private static final String PATH = "/Users/thor/Arbeit/Themen/Code/Java_02_2025/src/main/java/__meiner/json/level2/Json_Collections";
    private String jsonDocumentName;

    public JsonCollectionService() {
        new File(PATH).mkdirs();
    }

    public File open(String jsonDocumentName) {
        this.jsonDocumentName = jsonDocumentName.endsWith(".json") ? jsonDocumentName : jsonDocumentName + ".json";
        File file = new File(PATH, this.jsonDocumentName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                Files.write(file.toPath(), new JSONArray().toString(4).getBytes());
            } catch (IOException e) {
                throw new RuntimeException("❌ Fehler beim Erstellen der JSON-Datei", e);
            }
        }
        return file;
    }

    public JSONArray readJsonCollection() {
        try {
            File file = getFile();
            if (!file.exists()) return new JSONArray();
            String content = new String(Files.readAllBytes(file.toPath()));
            return new JSONArray(content);
        } catch (IOException e) {
            throw new RuntimeException("❌ Fehler beim Lesen der JSON-Datei", e);
        }
    }

    public void addUniqueEntry(JSONObject newObject) {
        JSONArray collection = readJsonCollection();
        for (int i = 0; i < collection.length(); i++) {
            JSONObject existingObject = collection.getJSONObject(i);
            if (existingObject.getString("name").equals(newObject.getString("name")) &&
                    existingObject.getInt("alter") == newObject.getInt("alter")) {
                System.out.println("⚠️ Objekt bereits vorhanden: " + newObject);
                return;
            }
        }
        create(newObject);
        System.out.println("✅ Neues Objekt hinzugefügt: " + newObject);
    }

    public void create(JSONObject newObject) {
        JSONArray collection = readJsonCollection();
        int maxId = 0;
        for (int i = 0; i < collection.length(); i++) {
            int currentId = collection.getJSONObject(i).getInt("id");
            if (currentId > maxId) {
                maxId = currentId;
            }
        }
        newObject.put("id", maxId + 1);
        collection.put(newObject);
        updateJsonCollection(collection);
    }

    /**
     * ✏️ **Aktualisiert die JSON-Collection in der Datei**
     *
     * Schreibt die aktualisierte JSON-Collection in die Datei und ersetzt den bestehenden Inhalt.
     *
     * @param collection Die aktualisierte JSON-Collection
     */
    public void updateJsonCollection(JSONArray collection) {
        try {
            Files.write(getFile().toPath(), collection.toString(4).getBytes());
        } catch (IOException e) {
            throw new RuntimeException("❌ Fehler beim Aktualisieren der JSON-Datei", e);
        }
    }

    public boolean deleteJsonFile() {
        try {
            File file = getFile();
            return file.exists() && file.delete();
        } catch (Exception e) {
            throw new RuntimeException("❌ Fehler beim Löschen der JSON-Datei", e);
        }
    }

    private File getFile() {
        return new File(PATH, jsonDocumentName);
    }
}
