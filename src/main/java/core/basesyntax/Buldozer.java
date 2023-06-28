package core.basesyntax;

public class Buldozer extends Machine {
    public Buldozer() {
    }
    @Override
    public void doWork() {
        System.out.println("Buldozer started work!");
    }
    @Override
    public void stopWork() {
        System.out.println("Buldozer stopped its work!");
    }
}
