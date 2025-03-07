package _2_Java_Grundlagen._300_390._410_Polymorphie;

class Maschiene {
    public static int counter = 0;
    private int id;
    protected String type;

    private boolean isActive;

    Maschiene() {
        this.id = counter++;
        this.type = "Maschiene";
        this.isActive = false;
    }

    public String toString() {
        return this.type + " { id: " + this.id + " status: " + (this.isActive ? "aktiv" : "inaktiv") + " }";
    }

    public void setActiv(boolean value) {
        this.isActive = value;
    }
}
