package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer has started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer has stopped its work");
    }
}
