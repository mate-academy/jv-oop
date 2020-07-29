package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void startWork() {
        System.out.println("Excavator start");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop");
    }
}
