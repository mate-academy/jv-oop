package core.basesyntax;

public class Bulldozer extends Machine {
    private final String className = this.getClass().getSimpleName();

    @Override
    public void doWork() {
        System.out.println(className + " has just begun working");
    }

    @Override
    public void stopWork() {
        System.out.println(className + " has just stopped working");
    }
}
