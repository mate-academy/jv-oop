package core.basesyntax;

import core.basesyntax.smth.Bulldozer;
import core.basesyntax.smth.Excavator;
import core.basesyntax.smth.Machine;
import core.basesyntax.smth.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Truck(), new Excavator(), new Bulldozer()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
