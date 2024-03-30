package core.basesyntax;

import core.basesyntax.entity.Bulldozer;
import core.basesyntax.entity.Excavator;
import core.basesyntax.entity.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = {new Bulldozer(), new Excavator(), new Truck()};

        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
