package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer work");
    }

    @Override
    public void spotWork() {
        System.out.println("Bulldozer stops work");
    }
}
