package core.basesyntax;
public class Bulldozer extends Machine {
    public Bulldozer() {
    }
    @Override
    public void doWork() {
        System.out.println("Bulldozer started it`s work");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped it`s work");
    }
}