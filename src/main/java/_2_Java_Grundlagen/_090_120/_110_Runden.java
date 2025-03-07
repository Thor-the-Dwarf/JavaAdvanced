package _2_Java_Grundlagen._090_120;

import java.text.DecimalFormat;

public class _110_Runden {

    public static void main(String[] args) {

        // Math.round()
        // Kaufmännisches Runden
        System.out.println(Math.round(4.49));   // 4
        System.out.println(Math.round(4.5));    // 5
//        System.out.println(Math.round(-4.49));  // -4
//        System.out.println(Math.round(-4.5));   // -4
//        System.out.println(Math.round(-4.500000001));   // -5

//        // Math.floor() - Abrunden
//        // Zieht zu Minus-Unendlich
//        System.out.println(Math.floor(4.9));   // 4.0
//        System.out.println(Math.floor(-4.9));  // -5.0
//
//        // Math.ceil() - Aufrunden
//        System.out.println( Math.ceil(1.2));   // 2.0
//        System.out.println(Math.ceil(-1.2));  // -1.0
//
//        // DecimalFormat
//        // # (vor dem Komma) steht für eine beliebige Anzahl von Stellen
//        // 0 steht für gemau eine Stelle
//        // Rundet kaufmännisch
        DecimalFormat df1 = new DecimalFormat("#.0");
        System.out.println(df1.format(123.45));   // 123,5
        System.out.println(df1.format(123.449));  // 123,4
////
////        // Pattern für Währung
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println(df2.format(123.345));   // 123,34
//        System.out.println(df2.format(123.349));   // 123,35
//        System.out.println(df2.format(123.3));     // 123,30
//
//        // # (nach dem Komma) steht für die maximale Anzahl von Stellen
        DecimalFormat df3 = new DecimalFormat("#.##");
        System.out.println(df3.format(123.345));   // 123,34
        System.out.println(df3.format(123.349));   // 123,35
        System.out.println(df3.format(123.3));     // 123,3
//
//        // Tausender-Trenner
//        DecimalFormat df4 = new DecimalFormat(",###");
//        System.out.println(df4.format(1234567890));   // 1.234.567.890
//
//        DecimalFormat df5 = new DecimalFormat(",###.00 \u00A4");
//        System.out.println(df5.format(1234567890));   // 1.234.567.890,00 €
//
//        DecimalFormat df6 = new DecimalFormat(",###.00 HelloCoin");
//        System.out.println(df6.format(1234567890));   // 1.234.567.890,00 HelloCoin
//
//        // Mit Decimalformat weiter rechnen
//        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
//        DecimalFormat df = new DecimalFormat("#.00", symbols);
//        String zahlStr = df.format(10 / 3.0);
//        System.out.println(zahlStr);  // "3.33"
//        Double zahlDou = Double.parseDouble(zahlStr) + 6;
//        System.out.println(zahlDou);  // 9.33
//
//        // String.format()
//        // Rundet kaufmännisch
//        System.out.println("Ausgabe: " + String.format("%.2f", 12.1149));  // Ausgabe: 12,11
//        System.out.println("Ausgabe: " + String.format("%.2f", 12.115));   // Ausgabe: 12,12
//
//        // System.out.printf()
//        System.out.printf("%.2f", 12.1149);  // 12,11
//        System.out.println();
//        System.out.printf("%.2f", 12.115);  // 12,12
//        System.out.println();

    }
}
