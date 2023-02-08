package mashines;

import core.basesyntax.Mashine;

public class Truck extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Truck started working!");
    }

    @Override
    public void doStop() {
        System.out.println("Truck has finished working!");
    }
}
