package core.basesyntax;

public class Excavator extends Machine {

    @java.lang.Override
    public void doWork() {
        System.out.println("Excavator was started to work");
    }

    @java.lang.Override
    public void stopWork() {
        System.out.println("Excavator was stopped to work");
    }
}
