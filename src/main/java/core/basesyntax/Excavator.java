package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String name) {
        super(name);
    }


    @Override
    public void doWork() {
        System.out.println(name + " start working");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stop working");
    }
}
