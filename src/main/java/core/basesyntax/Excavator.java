package core.basesyntax;

public class Excavator extends Machine {
    private String name;

    public Excavator(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is started work");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " is stopped working");
    }
}
