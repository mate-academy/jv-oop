package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("A Bulldozer is started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("A Bulldozer is stopped its work");
    }
}
