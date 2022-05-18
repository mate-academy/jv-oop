package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] workMachines = new Machine[6];
        for (int i = 0; i < workMachines.length; i += 3) {
            workMachines[i] = new Truck(i);
            workMachines[i + 1] = new Bulldozer(i + 1);
            workMachines[i + 2] = new Excavator(i + 2);
        }
        for (Machine machine : workMachines) {
            machine.doWork();
            machine.doWork();
            machine.stopWork();
            machine.stopWork();
        }
    }
}
