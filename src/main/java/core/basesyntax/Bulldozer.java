package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldoser start to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldoser stop to work");
    }
}
