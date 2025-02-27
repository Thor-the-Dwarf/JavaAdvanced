package _2_Java_Grundlagen._300_390;

// super verweist stets auf die Elternklasse
// super muss stets an oberster Stelle im Konstruktor benutzt werden

class Animal {
    String type;


    // todo Konstroktor erstmal nicht schreiben
    // todo STEP 2
    Animal() {
        System.out.println("Animal() got called");
        this.type = "Animal";
    }

    void breath() {
        System.out.println("Animals breath got called");
        System.out.println(this.type + " atmet");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog() got called");
        this.type = "Hund";
    }


    // todo STEP 3
    void waveTail() {
        System.out.println(this.type + " wedelt mit dem Schwanz.");
    }

    // todo STEP 4
    void superBreath() {
        super.breath();
    }

    @Override
    void breath() {
        System.out.println(this.type + " hat breath gerufen");
        super.breath();
    }
}

public class _340_VererbungUndSuper {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.breath();
        dog.breath();
        dog.waveTail();
//        animal.waveTail(); // java: Symbol nicht gefunden

        dog.superBreath();
    }
}
