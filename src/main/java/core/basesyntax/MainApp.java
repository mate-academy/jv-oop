package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Machine;
import core.basesyntax.model.Truck;

public class MainApp {
    public static void main(String[] args) {
        doAndStopWorkForEachMachine();
    }

    private static void doAndStopWorkForEachMachine() {
        for (Machine machine : buildMachines()) {
            machine.doWork();
            machine.stopWork();
        }
    }

    private static Machine[] buildMachines() {
        return new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
    }
}
