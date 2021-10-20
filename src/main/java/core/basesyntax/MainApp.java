package core.basesyntax;

import core.basesyntax.models.Bulldozer;
import core.basesyntax.models.Excavator;
import core.basesyntax.models.Machine;
import core.basesyntax.models.Truck;

public class MainApp {

    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Excavator();
        machines[1] = new Bulldozer();
        machines[2] = new Truck();

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
