package core.basesyntax;

public class Buldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Machine buldozer started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer stopped working");
    }
}
