package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck has started to shallow digging and ditching; "
                + "short-range transportation of material; "
                + "spreading soil dumped from trucks; "
                + "rough grading; "
                + "removing trees, stumps, and boulders; "
                + "and cleaning and leveling around loading equipment.");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has stopped to shallow digging and ditching; "
                + "short-range transportation of material; "
                + "spreading soil dumped from trucks; "
                + "rough grading; "
                + "removing trees, stumps, and boulders; "
                + "and cleaning and leveling around loading equipment.");
    }
}