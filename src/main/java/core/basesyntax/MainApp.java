package core.basesyntax;

import core.basesyntax.model.Bulldozer;
import core.basesyntax.model.Excavator;
import core.basesyntax.model.Machine;
import core.basesyntax.model.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
