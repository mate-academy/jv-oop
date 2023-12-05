package core.basesyntax;

import static java.lang.System.out;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        out.println(this.getClass().getSimpleName() + " started working...");
    }

    @Override
    public void stopWork() {
        out.println(this.getClass().getSimpleName() + " stopped working...");
    }
}
