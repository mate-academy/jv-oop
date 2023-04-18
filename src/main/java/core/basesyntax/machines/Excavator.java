package core.basesyntax.machines;

import static core.basesyntax.providers.SampleProvider.getDoWorkSample;
import static core.basesyntax.providers.SampleProvider.getStopWorkSample;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(getDoWorkSample("Excavator"));
    }

    @Override
    public void stopWork() {
        System.out.println(getStopWorkSample("Excavator"));
    }
}
