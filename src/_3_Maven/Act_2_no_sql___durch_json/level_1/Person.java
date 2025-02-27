package _3_Maven.Act_2_no_sql___durch_json.level_1;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int alter;
    private boolean weiblich;

    // Konstruktor
    public Person(String name, int alter, boolean weiblich) {
        this.name = name;
        this.alter = alter;
        this.weiblich = weiblich;
    }

    // Getter
    public String getName() { return name; }
    public int getAlter() { return alter; }
    public boolean isWeiblich() { return weiblich; }

    // Setter
    public void setName(String name) { this.name = name; }
    public void setAlter(int alter) { this.alter = alter; }
    public void setWeiblich(boolean weiblich) { this.weiblich = weiblich; }

    // Konvertiert das Objekt in eine Map (toMap)
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("alter", alter);
        map.put("weiblich", weiblich);
        return map;
    }

    // Erstellt eine Person aus einer Map (fromMap)
    public static Person fromMap(Map<String, Object> map) {


        return new Person(
                (String) map.get("name"),
                (int) map.get("alter"),
                (boolean) map.get("weiblich")
        );
    }

    // Konvertiert das Objekt in einen JSON-String
    public JSONObject toJson() {
        return new JSONObject(this.toMap()); // ✅ Richtiges JSON-Format
    }

    // Erstellt eine Person aus einem JSONObject
    public static Person fromJson(JSONObject jsonObject) {
        return new Person(
                jsonObject.getString("name"),
                jsonObject.getInt("alter"),
                jsonObject.getBoolean("weiblich")
        );
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":{" +
                "name:'" + name + ',' +
                " alter:" + alter + ',' +
                " weiblich:" + weiblich +
                "}";
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Clara");
        map.put("alter", 54);
        map.put("weiblich", true);

        Person person = Person.fromMap(map);
        Person person1 = Person.fromMap(map);
        System.out.println(person);
        System.out.println(person1);
    }
}