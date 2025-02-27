package _2_Java_Grundlagen._300_390;

class Tier {
    void atme() {
        System.out.println("Tier atmet");
    }
}

class Hund extends Tier {
    @Override
    void atme() {
        System.out.println("Hund atmet");
    }
}

class Katze extends Tier {
    @Override
    void atme() {
        System.out.println("Katze atmet");
    }
}

public class _370_MethodOverWriting {
    public static void main(String[] args) {
        Tier tier = new Tier();
        Hund hund = new Hund();
        Katze katze = new Katze();

        tier.atme();
        hund.atme();
        katze.atme();
    }
}
