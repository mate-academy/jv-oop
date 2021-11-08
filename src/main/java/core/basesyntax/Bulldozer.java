package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(name + " started work");
    }
    @Override
    public void stopWork() {
        System.out.println(name + " stopped work");
    }
}
