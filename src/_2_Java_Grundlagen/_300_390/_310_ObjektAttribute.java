package _2_Java_Grundlagen._300_390;


class Pizza {
    String belag = "Salami";
    int durchmesser = 30;
}


public class _310_ObjektAttribute {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        System.out.println("pizza1");
        System.out.println(pizza1);
        System.out.println(pizza1.belag);
        System.out.println(pizza1.durchmesser);


        System.out.println("pizza2");
        System.out.println(pizza2.belag);
        System.out.println(pizza2.durchmesser);


        System.out.println("pizza2 werte geändert");
        pizza2.belag = "Fungi";
        pizza2.durchmesser = 48;
        System.out.println(pizza2.belag);
        System.out.println(pizza2.durchmesser);


        System.out.println("pizza1 hat immernoch die selben Werte");
        System.out.println(pizza1.belag);
        System.out.println(pizza1.durchmesser);

    }
}


