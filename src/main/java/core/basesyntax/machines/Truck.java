package core.basesyntax.machines;

import static core.basesyntax.providers.SampleProvider.getDoWorkSample;
import static core.basesyntax.providers.SampleProvider.getStopWorkSample;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(getDoWorkSample("Truck"));
    }

    @Override
    public void stopWork() {
        System.out.println(getStopWorkSample("Truck"));
    }
}
