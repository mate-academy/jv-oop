package core.basesyntax;

public class Buildozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buildozer started work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Buildozer stoped work.");
    }
}
