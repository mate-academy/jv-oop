package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void stopWork() {
        System.out.println("The bulldozer has finished working");
    }

    @Override
    public void doWork() {
        System.out.println("The bulldozer starts working");
    }
}
