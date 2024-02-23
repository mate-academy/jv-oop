package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Вантажівка почала роботу.");
    }

    @Override
    public void stopWork() {
        System.out.println("Вантажівка зупинила роботу.");
    }
}
