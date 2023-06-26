package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Machine;
import core.basesyntax.model.Truck;

public class MainApp {
    public static void main(String[] args) {
        doAndStopWorkForEachMachine();
    }

    static void doAndStopWorkForEachMachine() {
        for (Machine machine: buildEach()) {
            machine.doWork();
            machine.stopWork();
        }
    }

    static Machine[] buildEach() {
        return new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
    }
}
