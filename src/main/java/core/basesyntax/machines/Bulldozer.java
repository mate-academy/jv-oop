package core.basesyntax.machines;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("The bulldozer started working");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped working");
    }
}
