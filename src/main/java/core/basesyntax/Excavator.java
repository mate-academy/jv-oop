package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        return "Certain machine started its work";
    }

    @Override
    public void stopWork() {
        return "certain machines stopped working";
    }
}
