package mashines;

import core.basesyntax.Mashine;

public class Excavator extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Excavator started working!");
    }

    @Override
    public void doStop() {
        System.out.println("Excavator has finished working!");
    }
}
