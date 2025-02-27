package _3_Maven.Act_2_no_sql___durch_json.level_2._220_Die_Json_Collection;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;

public class Main_json_collections {
    public static void main(String[] args) {
        // 🏁 **Initialisiert die JsonCollectionService Instanz**
        JsonCollectionService service = new JsonCollectionService();
        String fileName = "testCollection";

        // 📂 **Öffnet oder erstellt die JSON-Collection-Datei**
        File file = service.open(fileName);
        System.out.println("📄 Datei geöffnet/erstellt: " + file.getAbsolutePath());

        // ➕ **Fügt ein erstes Objekt zur Collection hinzu**
        JSONObject object1 = new JSONObject().put("name", "Max").put("alter", 30);
        service.create(object1);
        System.out.println("✅ Erstes Objekt hinzugefügt: " + object1);

        // ➕ **Fügt ein weiteres Objekt zur Collection hinzu**
        JSONObject object2 = new JSONObject().put("name", "Anna").put("alter", 25);
        service.create(object2);
        System.out.println("✅ Zweites Objekt hinzugefügt: " + object2);
//
        // ➕ **Fügt ein weiteres Objekt zur Collection hinzu**
        JSONObject object3 = new JSONObject().put("name", "Lisa").put("alter", 28);
        service.create(object3);
        System.out.println("✅ Drittes Objekt hinzugefügt: " + object3);
//
        // 📖 **Liest die JSON-Collection und gibt den Inhalt aus**
        JSONArray readCollection = service.readJsonCollection();
        System.out.println("📜 Gelesene Collection: " + readCollection.toString(20));

//        // 🗑️ **Löscht die JSON-Collection-Datei und gibt den Status aus**
//        boolean deleted = service.deleteJsonFile();
//        System.out.println(deleted ? "✅ Datei gelöscht" : "❌ Löschen fehlgeschlagen");
    }
}
