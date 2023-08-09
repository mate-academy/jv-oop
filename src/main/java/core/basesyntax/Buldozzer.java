package core.basesyntax;

public class Buldozzer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozzer started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozzer stopped working");
    }
}
