package core.basesyntax;

import core.basesyntax.Base.Machine;
import core.basesyntax.Model.Bulldozer;
import core.basesyntax.Model.Excavator;
import core.basesyntax.Model.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {
                new Truck(),
                new Bulldozer(),
                new Excavator()
        };

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}