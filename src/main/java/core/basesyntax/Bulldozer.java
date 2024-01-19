package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine is working");

    }

    @Override
    public void stopWork() {
        System.out.println("Machines stopped working");
    }
}
