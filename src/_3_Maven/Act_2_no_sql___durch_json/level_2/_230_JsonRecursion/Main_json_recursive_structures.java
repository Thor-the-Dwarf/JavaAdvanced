package _3_Maven.Act_2_no_sql___durch_json.level_2._230_JsonRecursion;

import org.json.JSONObject;

import java.io.File;

public class Main_json_recursive_structures {
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
