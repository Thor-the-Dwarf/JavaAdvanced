package _2_Java_Grundlagen._0_Java_im_Terminal;

public class MyClass {

    ///    🌟******************************************************
    ///    🌟 Prüfen ob Java korrekt installiert ist
    ///    🌟******************************************************
    ///    ✅ Befehl: Java-Version anzeigen
    ///   ______📟 Terminal: 📟_______
    ///    cd /pfad/zum/projekt/ordner     ✅ Wechsle in dein Projektverzeichnis
    ///    javac -version
    ///    ____________________________
    ///
    ///    ✅ Befehl: Java-Compiler-Version anzeigen
    ///   ______📟 Terminal: 📟_______
    ///    javac -version
    ///    ____________________________
    ///
    ///    🌟**************************************************
    ///    🌟 Falls ja
    ///    🌟******************************************************
    ///    1️⃣ In das Verzeichnis navigieren, in dem sich die Datei befindet
    ///    ✅ Befehl: Java-Compiler-Version anzeigen
    ///   ______📟 Terminal: 📟_______
    ///    javac MyClass.java   ✅ Datei kompilieren
    ///    java MyClass         ✅ Programm ausführen
    ///    ____________________________
    ///
    ///    🌟******************************************************
    ///    🌟 Problembehandlung: falls Java oder Java-Compiler (javac)
    ///    🌟 nicht installiert ist
    ///    🌟******************************************************
    ///    🛠️ 1. Java herunterladen (empfohlen bei Oracle)
    ///    🔗 Webseite: https://www.oracle.com/java/technologies/javase-downloads.html
    ///
    ///    🛠️ 2. Installation mit der Datei "_1_Installation_windows.txt" starten
    ///    ⚙️ 3. Verknüpfung mit PATH erstellen (automatische Option)
    ///
    ///    🌟 (optional) Manuelle Konfiguration
    ///    ✅ Java-Installationspfad anzeigen
    ///   ______📟 Terminal: 📟_______
    ///    where java
    ///    ____________________________
    ///
    ///    3.1. Pfad inklusive Ordner "bin" kopieren 🗂️
    ///    3.2. Nach "Umgebungsvariablen" suchen und öffnen 🔍
    ///    3.3. Doppelklick auf "PATH" im unteren Bereich
    ///    3.4. Neuen Eintrag erstellen und den kopierten Pfad einfügen (STRG+V)



    public static void main(String[] args) {
//        System.out.println("Hallo Welt" + args[0] + args[1]);
        System.out.println("Hallo Welt");
    }


}
