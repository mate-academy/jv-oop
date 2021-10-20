package core.basesyntax;

import core.basesyntax.model.Machine;
import core.basesyntax.samples.Bulldozer;
import core.basesyntax.samples.Excavator;
import core.basesyntax.samples.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine type : machines) {
            type.doWork();
        }

        for (Machine type : machines) {
            type.stopWork();
        }
    }
}
