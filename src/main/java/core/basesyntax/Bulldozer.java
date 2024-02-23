package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Бульдозер почав роботу.");
    }

    @Override
    public void stopWork() {
        System.out.println("Бульдозер зупинив роботу.");
    }
}
