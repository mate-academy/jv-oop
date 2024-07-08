package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        return "Certain machine started its work";
    }

    @Override
    public void stopWork() {
        return "certain machines stopped working";
    }
}
