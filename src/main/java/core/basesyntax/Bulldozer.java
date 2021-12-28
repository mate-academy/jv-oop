package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The " + getEngine() + " its work. ");
    }

    @Override
    public void stopWork() {
        System.out.println(getEngine() + "work.");
    }
}
