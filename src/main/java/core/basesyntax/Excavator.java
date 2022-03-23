package core.basesyntax;

public class Excavator extends Machine {
    private String name;

    public Excavator(String name) {
        this.name = name;
    }

    public void doWork() {
        System.out.println(name + " started working");
    }

    public void stopWork() {
        System.out.println(name + " stopped working");
    }
}
