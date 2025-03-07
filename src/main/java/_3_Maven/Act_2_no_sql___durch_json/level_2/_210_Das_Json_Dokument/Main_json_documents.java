package _3_Maven.Act_2_no_sql___durch_json.level_2._210_Das_Json_Dokument;

import org.json.JSONObject;
import java.io.File;

public class Main_json_documents {
    public static void main(String[] args) {
        // 🏁 **Initialisiert die JsonDocumentService Instanz**
        JsonDocumentService service = new JsonDocumentService();
        String fileName = "testDokument1";

        // 📂 **Öffnet oder erstellt die JSON-Datei**
        File file = service.open(fileName);
        System.out.println("📄 Datei geöffnet/erstellt: " + file.getAbsolutePath());

        // ✏️ **Aktualisiert die JSON-Datei mit initialen Daten**
        JSONObject initialData = new JSONObject().put("name", "Max").put("alter", 55);
        service.updateJsonFile(initialData);
        System.out.println("✅ Datei aktualisiert mit: " + initialData);

        // 📖 **Liest die JSON-Datei und gibt den Inhalt aus**
        JSONObject readData = service.readJsonFile();
        System.out.println("📜 Gelesene Daten: " + readData);

        // 🔄 **Aktualisiert die JSON-Datei erneut mit neuen Daten**
        JSONObject updatedData = new JSONObject().put("name", "Anna").put("alter", 10).put("geschlecht", "weiblich");
        service.updateJsonFile(updatedData);
        System.out.println("✅ Datei erneut aktualisiert mit: " + updatedData);
//
//        // 📖 **Liest die aktualisierte JSON-Datei und gibt den Inhalt aus**
//        JSONObject newData = service.readJsonFile();
//        System.out.println("📜 Aktualisierte Daten: " + newData);

//        // 🗑️ **Löscht die JSON-Datei und gibt den Status aus**
//        boolean deleted = service.deleteJsonFile();
//        System.out.println(deleted ? "✅ Datei gelöscht" : "❌ Löschen fehlgeschlagen");
    }
}
