package _2_Java_Grundlagen._300_390;


class Pizzzza {
    String belag;
    int durchmesser;

    Pizzzza() {
        System.out.println("Default Konstruktor wurde aufgerufen");
        this.belag = "Salami";
        this.durchmesser = 30;
    }

    // Objekte / Instanzen können nicht nur Träger von Daten sein sondern auch Träger von Algorythmen

    void info() {
        System.out.println("ich bin eine Pizza! mein Belag ist: "
                + this.belag + " mein durchmesser ist: " + this.durchmesser);
    }
}


public class _330_InstanzMethode {
    public static void main(String[] args) {

        Pizzzza pizza = new Pizzzza();
        Pizzzza pizza2 = new Pizzzza();
        pizza2.belag = "Diavolo";
        pizza2.durchmesser = 45;
        pizza.info();
        pizza2.info();

        new Pizzzza().info();
    }
}
