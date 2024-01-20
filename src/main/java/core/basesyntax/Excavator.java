package core.basesyntax;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator says: I am Excavator, not Escalator!");
    }
    public void stopWork() {
        System.out.println("Excavator stops complaining");
    }
}
