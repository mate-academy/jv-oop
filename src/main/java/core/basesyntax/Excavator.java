package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("making dubstep noises...");
    }

    @Override
    public void stopWork() {
        System.out.println("i'm dead now");
    }
}
