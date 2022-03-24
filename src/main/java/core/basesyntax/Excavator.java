package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String name) {
        super.name = name;
    }

    public void doWork() {
        System.out.println(name + " started working");
    }

    public void stopWork() {
        System.out.println(name + " stopped working");
    }
}
