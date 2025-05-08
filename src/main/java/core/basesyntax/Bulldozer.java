package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer starts to do something...");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer finished doing something.");
    }
}
