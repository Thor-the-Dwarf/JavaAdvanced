package _3_Maven.Act_2_no_sql___durch_json.level_2._210_Das_Json_Dokument;

import java.io.*;
import java.nio.file.*;
import org.json.*;

/**
 * ✅ **JsonDocumentService**
 *
 * Diese Klasse verwaltet JSON-Dateien und ermöglicht das **Erstellen**, **Lesen**, **Aktualisieren** und **Löschen**.
 */
public class JsonDocumentService {
    // Speicherort
    private static final String PATH = "/Users/thor/Arbeit/Themen/Code/Java_02_2025/src/main/java/__meiner/json/level2/Json_Documents";
    // Dateiname
    private String jsonDocumentName;

    /**
     * 🏗️ **Konstruktor**
     *
     * Erstellt eine neue Instanz des `JsonDocumentService`. Falls der Pfad noch nicht existiert,
     * wird er automatisch erstellt.
     */
    public JsonDocumentService() {
        // Erstellt das Verzeichnis für die JSON-Dateien, falls es nicht existiert.
        new File(PATH).mkdirs();
    }

    /**
     * 📂 **Öffnet oder erstellt eine JSON-Datei**
     *
     * Falls die Datei nicht existiert, wird sie als leeres JSON-Dokument angelegt.
     * Falls sie bereits existiert, wird sie geladen.
     *
     * @param jsonDocumentName Der Name der JSON-Datei
     * @return Die geöffnete oder erstellte Datei
     */
    public File open(String jsonDocumentName) {
        // Fügt die Endung `.json` hinzu, falls nicht bereits vorhanden
        this.jsonDocumentName = jsonDocumentName.endsWith(".json") ? jsonDocumentName : jsonDocumentName + ".json";
        File file = new File(PATH, this.jsonDocumentName);

        // Falls die Datei nicht existiert, erstelle ein leeres JSON-Dokument
        if (!file.exists()) {
            try {
                file.createNewFile(); // Erstellt die Datei im angegebenen Verzeichnis
                Files.write(file.toPath(), new JSONObject().toString(4).getBytes()); // Schreibt ein leeres JSON-Objekt hinein
            } catch (IOException e) {
                throw new RuntimeException("❌ Fehler beim Erstellen der JSON-Datei", e);
            }
        }
        return file;
    }

    /**
     * 📖 **Liest eine JSON-Datei**
     *
     * Falls die Datei existiert, wird ihr Inhalt als `JSONObject` zurückgegeben.
     * Falls nicht, wird `null` zurückgegeben.
     *
     * @return Der JSON-Inhalt oder `null`, falls die Datei nicht existiert.
     */
    public JSONObject readJsonFile() {
        try {
            File file = getFile();
            if (!file.exists()) return null; // Falls die Datei nicht existiert, gib `null` zurück

            // Liest den Inhalt der Datei als String und konvertiert ihn in ein JSONObject
            String content = new String(Files.readAllBytes(file.toPath()));
            return new JSONObject(content);
        } catch (IOException e) {
            throw new RuntimeException("❌ Fehler beim Lesen der JSON-Datei", e);
        }
    }

    /**
     * ✏️ **Aktualisiert eine JSON-Datei**
     *
     * Die vorhandene Datei wird überschrieben, falls sie existiert.
     *
     * @param newData Die neuen JSON-Daten
     * @return Die aktualisierte Datei
     */
    public File updateJsonFile(JSONObject newData) {
        try {
            File file = getFile();
            // Schreibt das neue JSON-Objekt in die Datei und überschreibt den vorhandenen Inhalt
            Files.write(file.toPath(), newData.toString(4).getBytes());
            return file;
        } catch (IOException e) {
            throw new RuntimeException("❌ Fehler beim Aktualisieren der JSON-Datei", e);
        }
    }

    /**
     * 🗑️ **Löscht eine JSON-Datei**
     *
     * Falls die Datei existiert, wird sie gelöscht.
     *
     * @return `true`, falls die Datei gelöscht wurde, sonst `false`
     */
    public boolean deleteJsonFile() {
        try {
            File file = getFile();
            // Prüft, ob die Datei existiert und löscht sie dann
            return file.exists() && file.delete();
        } catch (Exception e) {
            throw new RuntimeException("❌ Fehler beim Löschen der JSON-Datei", e);
        }
    }

    /**
     * 📂 **Ermittelt den Speicherort der Datei**
     *
     * @return Die Datei als `File`-Objekt
     */
    private File getFile() {
        // Gibt das File-Objekt zurück, das der aktuellen JSON-Datei entspricht
        return new File(PATH, jsonDocumentName);
    }
}
