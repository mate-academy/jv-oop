package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Start excavating a trench");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop digging trench and rest");
    }
}
