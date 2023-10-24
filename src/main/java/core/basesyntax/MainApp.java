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
        Machine[] machines = buildMachines();
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

    private static Machine[] buildMachines() {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        return new Machine[]{truck, bulldozer, excavator};
    }
}
