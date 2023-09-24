package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buildozer started its work");

    }

    @Override
    public void stopWork() {
        System.out.println("Buildozer stopped its work");
    }
}
