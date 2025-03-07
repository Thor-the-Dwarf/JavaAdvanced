package _2_Java_Grundlagen._300_390;

class Pizzza {
    String belag;
    int durchmesser;


    // ist kein Konstruktor vorhanden erzeugt Java einen Default-Konstruktor (Konstruktor ohne Parameter)
    // dieser wird entfernt, sobald ein beliebiger Konstruktor existiert
    Pizzza() {
        System.out.println("Default Konstruktor wurde aufgerufen");
        this.belag = "Salami";
        this.durchmesser = 30;
    }

    Pizzza(String belag) {
        System.out.println("belag Konstruktor wurde aufgerufen");
        this.belag = belag;
        this.durchmesser = 30;
    }

    Pizzza(int druchmesser) {
        System.out.println("druchmesser Konstruktor wurde aufgerufen");
        this.belag = "Salami";
        this.durchmesser = druchmesser;
    }

    Pizzza(String belag, int druchmesser) {
        System.out.println("belag und druchmesser Konstruktor wurde aufgerufen");
        this.belag = belag;
        this.durchmesser = druchmesser;
    }
}


public class _320_KonstruktorUndThis {
    public static void main(String[] args) {
        Pizzza defaultPizza = new Pizzza();
        System.out.println("defaultPizza: " + defaultPizza.belag + " " + defaultPizza.durchmesser + "\n");

        Pizzza belagPizza = new Pizzza("Margherita");
        System.out.println("belagPizza: " + belagPizza.belag + " " + belagPizza.durchmesser + "\n");

        Pizzza durchmesserPizza = new Pizzza(42);
        System.out.println("durchmesserPizza: " + durchmesserPizza.belag + " " + durchmesserPizza.durchmesser + "\n");

        Pizzza beidesPizza = new Pizzza("Diavolo", 15);
        System.out.println("beidesPizza: " + beidesPizza.belag + " " + beidesPizza.durchmesser);

    }
}


