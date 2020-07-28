package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is ready to excavate some bones!");
    }

    @Override
    public void stopWork() {
        System.out.println("A hole reached another side of Earth, Master! Excavator is chilling.");
    }
}
