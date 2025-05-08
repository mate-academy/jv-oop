package core.basesyntax;

import core.basesyntax.vehicles.Bulldozer;
import core.basesyntax.vehicles.Excavator;
import core.basesyntax.vehicles.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
