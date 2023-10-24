package core.basesyntax;

import core.basesyntax.models.Buldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Machine;
import core.basesyntax.models.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine buldozer = new Buldozer();
        Machine excavator = new Excavator();
        Machine[] machines = new Machine[]{truck, buldozer, excavator};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }

    }
}
