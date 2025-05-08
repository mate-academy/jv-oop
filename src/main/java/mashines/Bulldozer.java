package mashines;

import core.basesyntax.Mashine;

public class Bulldozer extends Mashine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started working!");
    }

    @Override
    public void doStop() {
        System.out.println("Bulldozer has finished working!");
    }
}
