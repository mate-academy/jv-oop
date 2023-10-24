package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[6];
        for (int i = 0; i < machines.length; i += 3) {
            machines[i] = new Truck(i);
            machines[i + 1] = new Bulldozer(i + 1);
            machines[i + 2] = new Excavator(i + 2);
        }
        for (Machine machine : machines) {
            machine.doWork();
            machine.doWork();
            machine.stopWork();
            machine.stopWork();
        }
    }
}
