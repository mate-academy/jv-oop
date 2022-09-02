package core.basesyntax;

import models.Bulldozer;
import models.Excavator;
import models.Machine;
import models.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
