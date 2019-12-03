package core.basesyntax;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer " + name + " start working");
    }

    public void stopWork() {
        System.out.println("Bulldozer " + name + " stop working");
    }

    Bulldozer(String s) {
        this.name = s;
    }
}
