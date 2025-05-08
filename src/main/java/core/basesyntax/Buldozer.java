package core.basesyntax;

public class Buldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The buldozer is starting");
    }

    @Override
    public void stopWork() {
        System.out.println("The buldozer is finishing work");
    }
}
