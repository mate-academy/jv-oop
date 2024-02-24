package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        String message = "Bulldozer started to work";
        System.out.println(message);
    }

    @Override
    public void stopWork() {
        String message = "Bulldozer stopped to work";
        System.out.println(message);
    }
}
