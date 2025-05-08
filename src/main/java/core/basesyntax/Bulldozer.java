package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Start backfilling of excavated trenches");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop trench backfilling. Rest");
    }
}
