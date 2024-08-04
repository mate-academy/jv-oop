package core.basesyntax;
public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is doing its work ⚙.");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped its work.");
    }
}