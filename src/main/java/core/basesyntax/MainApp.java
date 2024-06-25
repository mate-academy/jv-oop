package core.basesyntax;

import core.basesyntax.vehicles.Bulldozer;
import core.basesyntax.vehicles.Excavator;
import core.basesyntax.vehicles.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
