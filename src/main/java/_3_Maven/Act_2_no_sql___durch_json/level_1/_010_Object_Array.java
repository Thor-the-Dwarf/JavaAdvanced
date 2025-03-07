package _3_Maven.Act_2_no_sql___durch_json.level_1;

public class _010_Object_Array {

    public static void main(String[] args) {
//        level0();
//        level1();
//        level2();
//        level3();
        level4();
    }

    static void level0() {
        System.out.println("level0");
        // Ein einfaches Object erstellen
        Object meinObjekt = new Object();
        System.out.println("Mein Objekt: " + meinObjekt);

        // Objekt einer anderen Klasse zuweisen
        Object zahl = 42;
        Object text = "Hallo Welt";
        Object gleitkomma = 3.14;
        Object booleanWert = true;
        Object array = new int[]{1, 2, 3};

        // Typprüfung mit instanceof
        if (zahl instanceof Integer) {
            System.out.println("Zahl ist ein Integer: " + zahl);
        }
        if (text instanceof String) {
            System.out.println("Text ist ein String: " + text);
        }
        if (gleitkomma instanceof Double) {
            System.out.println("Gleitkomma ist ein Double: " + gleitkomma);
        }
        if (booleanWert instanceof Boolean) {
            System.out.println("Boolean-Wert ist ein Boolean: " + booleanWert);
        }
        if (array instanceof int[]) {
            System.out.println("Array ist ein int-Array.");
        }

        // Objekt in einen spezifischen Typ umwandeln (Casting)
        String castedText = zahl.toString();
        System.out.println("Gecasteter Text: " + castedText.toUpperCase());

        System.out.println();
    }

    static void level1() {
        System.out.println("level1");


        Object[] meinObjekt = new Object[]{
            /*Fahrzeug*/       new Object[]{"Auto", 30, "rostet"},
            /*Person*/         new Object[]{"Jungfrau", "männlich", 40, "verheiratet"},
        };
        printArray(meinObjekt, 0);
        System.out.println();
    }


    static void level2() {
        System.out.println("level2");
        Object[] meinObjekt = new Object[]{
                /*Fahrzeug*/       new Object[]{
                                            "Auto", 30, "rostet",
                    /*Bauteil*/        new Object[]{
                                            "Lenkrad", "brandneu", 55.8, 5, true
                                        }
                                    },
                /*Fahrzeug*/       new Object[]{"Auto", 0, "neu",
                    /*Bauteil*/        new Object[]{"Lenkrad", "brandneu", 55.8, 5, true}},
        };
        printArray(meinObjekt, 0);
        System.out.println();
    }

    static void level3() {
        System.out.println("level3");
        Object[] meinObjekt = new Object[]{
                /*Person*/         new Object[]{"Jungfrau", "männlich", 40, "verheiratet",
                /*Haustiere*/  new Object[][]{
                /*Hund*/    new Object[]{"Rüde", "Golden Retriever", "Claus", 5},
                /*Katze*/   new Object[]{"Kater", "Siam", "Klaus", 2}
        }
        },
                new Object[]{
                        /*Fahrzeug*/   new Object[]{"Auto", 30, "rostet",
                                /*Bauteil*/ new Object[]{"Lenkrad", "brandneu", 55.8, 5, true,
                                /*Ersatzteil*/ new Object[]{"schraube"}
                }
                },
                        /*Fahrzeug*/   new Object[]{"Auto", 0, "neu",
                                /*Bauteil*/ new Object[]{"Lenkrad", "brandneu", 55.8, 5, true}}
                }
        };
        printArray(meinObjekt, 0);
        System.out.println();
    }

    static void level4() {
        System.out.println("level4");
        Object[] meinObjekt = new Object[]{
                /*Person*/         new Object[]{"Jungfrau", "männlich", 40, "verheiratet",
                /*Haustiere*/  new Object[][]{
                /*Hund*/    new Object[]{"Rüde", "Golden Retriever", "Claus", 5},
                /*Katze*/   new Object[]{"Kater", "Siam", "Klaus", 2}
        }
        },
                new Object[]{
                        /*Fahrzeug*/   new Object[]{"Auto", 30, "rostet",
                        /*Bauteil*/ new Object[]{"Lenkrad", "brandneu", 55.8, 5, true,
                        /*Ersatzteil*/ new Object[]{"schraube"}
                }
                },
                        /*Fahrzeug*/   new Object[]{"Auto", 0, "neu",
                        /*Bauteil*/ new Object[]{"Lenkrad", "brandneu", 55.8, 5, true,
                        /*Zubehör*/ new Object[][]{
                        new Object[]{"schraube"},
                        new Object[]{"schmierfett"},
                        new Object[]{"Schraubenzieher"},
                        new Object[]{"Einbauanleitung"}
                }
                }
                }
                }
        };
        printArray(meinObjekt, 0);
        System.out.println();
    }

    static void printArray(Object[] array, int indent) {
        String indentSpace = " ".repeat(indent * 2);
        System.out.println(indentSpace + "[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Object[]) {
                printArray((Object[]) array[i], indent + 1);
            } else {
                System.out.print(indentSpace + "  " + array[i]);
            }
            if (i < array.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print(indentSpace + "]");
        if (indent == 0) {
            System.out.println();
        }
    }
}
