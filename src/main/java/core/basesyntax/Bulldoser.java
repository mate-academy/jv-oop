package core.basesyntax;

public class Bulldoser extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldoser start work!");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldoser stop work!");
    }
}
