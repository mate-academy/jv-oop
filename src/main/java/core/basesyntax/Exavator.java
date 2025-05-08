package core.basesyntax;

public class Exavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Exavator start working");
    }

    @Override
    public void stopWork() {
        System.out.println("Exavator stop working");
    }
}
