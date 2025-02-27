package _3_Maven.Act_2_no_sql___durch_json.level_1.missionen;

public class A010_Json_Reisepass {
    /**
     * ✈️ JSON-Challenge: "Der digitale Reisepass" ✈️
     *
     * 📌 **Szenario:**
     * Stell dir vor, du entwickelst eine Anwendung für digitale Reisepässe.
     * Jeder Reisepass enthält folgende Informationen:
     *
     * - **Besitzer** (String: Vor- und Nachname)
     * - **Alter** (int: muss positiv sein)
     * - **Staatsbürgerschaft** (String: z. B. "Deutschland", "Österreich", etc.)
     * - **Hat gültiges Visum?** (boolean: `true` oder `false`)
     *
     * 🔥 **Aufgabe:**
     * 1️⃣ **Erstelle eine Klasse `Reisepass`**, die diese Attribute als Felder besitzt.
     * 2️⃣ Implementiere Methoden:
     *     - `toJson()`: Konvertiert den Reisepass in ein `JSONObject`.
     *     - `fromJson(JSONObject jsonObject)`: Erstellt ein `Reisepass`-Objekt aus einem `JSONObject`.
     *     - `toString()`: Gibt den Reisepass als lesbaren String aus.
     * 3️⃣ **Testen**:
     *     - Erstelle mindestens **zwei Reisepässe** und konvertiere sie in JSON.
     *     - Gib das JSON formatiert aus.
     *     - Lese das JSON zurück in `Reisepass`-Objekte und gib diese aus.
     *
     * 🎯 **Bonus-Herausforderung:**
     * - Schreibe eine Methode `istVisumErforderlich()`, die prüft, ob ein Visum erforderlich ist.
     *   Falls die **Staatsbürgerschaft** "Deutschland" oder "Österreich" ist, gib `false` zurück, sonst `true`.
     *
     * --------------------------------------------
     *
     * ✅ **Beispiel für die Ausgabe:**
     *
     * JSON:
     * ```json
     * {
     *     "besitzer": "Max Mustermann",
     *     "alter": 30,
     *     "staatsbuergerschaft": "Deutschland",
     *     "hatVisum": false
     * }
     * ```
     *
     * Konsolenausgabe:
     * ```
     * Reisepass von Max Mustermann, Alter: 30, Staatsbürgerschaft: Deutschland, Visum erforderlich: Nein
     * ```
     *
     * Viel Erfolg! 🚀
     */
    public static void main(String[] args) {
        // todo Teste hier deine ReisePässe
    }
}

class Reisepass {}
