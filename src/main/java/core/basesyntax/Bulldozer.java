package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is stopped");
    }
}
