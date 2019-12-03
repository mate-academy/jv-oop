package core.basesyntax;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator " + name + " start working");
    }

    public void stopWork() {
        System.out.println("Excavator " + name + " stop working");
    }

    Excavator(String s) {
        this.name = s;
    }
}
