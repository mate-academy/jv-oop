package core.basesyntax;

public class Excavator extends Machine {
    public Excavator() {
        name = "Excavator";
    }

    @Override
    public void doWork() {
        System.out.println(name + " is ready to dig the ground");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " wants to sleep");
    }
}
