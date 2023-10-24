package core.basesyntax;

import core.basesyntax.model.Machine;
import core.basesyntax.model.impl.Bulldozer;
import core.basesyntax.model.impl.Excavator;
import core.basesyntax.model.impl.Truck;

public class MainApp {

    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
