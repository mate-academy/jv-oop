package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator is digging holes");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has dug holes");
    }
}
