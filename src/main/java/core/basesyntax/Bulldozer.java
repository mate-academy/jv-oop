package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm big bulldozer wrrrr!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped work");
    }
}
