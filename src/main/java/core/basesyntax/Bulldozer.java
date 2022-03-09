package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer was started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer was stopped to work");
    }
}
