package _2_Java_Grundlagen._400_490;

public class _420_abstract_class {
    public static void main(String[] args) {
//        AbstractClass a = new AbstractClass(); // AbstractClass ist abstrakt, kann nicht instanziiert werden
        ConcreteClass c = new ConcreteClass();
        c.sayHello();
        c.sayGoodBye();
        System.out.println(c.name);
        c.swim();
        System.out.println(c.nachname);
        c.run();
//        ICanSwim i = new ICanSwim();  // ICanSwim ist abstrakt, kann nicht instanziiert werden
    }
}


class ConcreteClass extends AbstractClass implements ICanSwim, ICanWalk{

    @Override
    void sayGoodBye() {
        System.out.println("Tschüss!");
    }

    @Override
    public void swim() {
        System.out.println("Ich schwimme!!");
    }

    @Override
    public void run() {
        System.out.println("Ich renne!!");
    }
}


interface ICanSwim{
    String nachname = "Maffay";
    void swim();
}

interface ICanWalk{
//    void walk(){              // interfaces können anders als abstrakte klassen keine konkreten ausprägungen von Methoden
//        System.out.println("Ich laufe!");
//    }
    void run();
}



abstract class AbstractClass {

    String name = "Peter";

    void sayHello(){
        System.out.println("Hallo!");
    }

    abstract void sayGoodBye();
}

