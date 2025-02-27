package _3_Maven.Act_2_no_sql___durch_json.level_1.missionen;


/**
 * 🎯 **Mission: Erstelle deine eigene Spaß-Datenbank!**
 *
 * In dieser Mission geht es darum, eine **Pseudo-Datenbank** zu erstellen,
 * die 3 verschiedene **Spaß-Klassen** verwaltet.
 * Anstatt trockene Geschäftsdaten zu speichern, machen wir es **kreativ und unterhaltsam!**
 *
 * 🛠 **Deine Aufgabe:**
 * - Erstelle eine eigene Klasse **`SpassDatenbank`**.
 * - Diese Klasse soll eine `List` enthalten, die **mindestens 3 verschiedene Spaß-Klassen** speichert.
 * - Beispiele für solche Klassen:
 *   - 🐉 **Drache** (mit einer `toString()`-Methode, die ASCII-Art ausgibt)
 *   - 👽 **UFO** (mit einer `toString()`-Methode, die ein Raumschiff zeigt)
 *   - 🤖 **Roboter** (mit einer `toString()`-Methode, die ASCII-Roboter generiert)
 *
 * 📌 **Zusatzaufgabe:**
 * - Implementiere eine `main()`-Methode, die deine **Spaß-Datenbank** erstellt und den Inhalt ausgibt.
 * - Achte darauf, dass du verschiedene ASCII-Kunstwerke verwendest, um es **visuell beeindruckend** zu gestalten!
 *
 * 🚀 **Ziel:** Verstehe, wie man mit **Listen von Objekten** arbeitet und gleichzeitig kreative Elemente in den Code einbaut.
 */





public class A020_SpassDatenbank {
    public static void main(String[] args) {
        Drache__ drache = new Drache__();
        System.out.println(drache);
    }
}

class Drache__ {
@Override
public String toString() {
    return  "                    ___====-_  _-====___\n" +
            "              _--^^^#####//      \\\\#####^^^--_\n" +
            "           _-^##########// (    ) \\\\##########^-_\n" +
            "          -############//  |\\^^/|  \\\\############-\n" +
            "        _/############//   (@::@)   \\\\############\\_\n" +
            "       /#############((     \\__/     ))#############\\\n" +
            "      -###############\\\\    (oo)    //###############-\n" +
            "     -#################\\\\  / \"\" \\  //#################-\n" +
            "    -###################\\\\/      \\//###################-\n" +
            "   _#/|##########/\\######(   /\\   )######/\\##########|\\#_\n" +
            "   |/ |#/_\\_/_\\_|  |#####\\  \"\"  /#####|  |_/_\\_/_\\#| \\|\n" +
            "      |(  o|o  )|  /######\\ |  |/######\\  |(  o|o  )|\n" +
            "       \\   \\_/   /        | | |        \\   \\_/   /\n" +
            "        \\   .   /         | | |         \\   .   /\n" +
            "         \\_____/_         /   \\         _\\_____/\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           | |  | |       |  |  |       | |  | |\n" +
            "           |_|  |_|       |_|  |_|       |_|  |_|\n";
}
}

