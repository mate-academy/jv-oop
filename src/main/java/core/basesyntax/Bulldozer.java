package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    protected void doWork() {
        System.out.println("Bulldozer START work now");
    }

    @Override
    protected void stopWork() {
        System.out.println("Bulldozer STOP work now");
    }
}
