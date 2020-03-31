package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.printf("%s is started work", getClass().getName());
    }

    @Override
    public void stopWork() {
        System.out.printf("%s is ended work", getClass().getName());
    }
}
