package core.basesyntax;

public class Excavator extends Machine {
    private String name = "Excavator";

    @Override
    public void doWork() {
        System.out.println(name + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " stopped working");
    }
}
