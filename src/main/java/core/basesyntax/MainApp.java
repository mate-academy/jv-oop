package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
