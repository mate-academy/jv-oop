package core.basesyntax;

public class Bulldoser extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Bulldoser started his work!");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldoser stopped his work...");
    }
}
