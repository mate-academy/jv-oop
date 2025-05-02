package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Екскаватор почав роботу.");
    }

    @Override
    public void stopWork() {
        System.out.println("Екскаватор зупинив роботу.");
    }
}
