package core.basesyntax;

import core.basesyntax.machines.*;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrOfMachines = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : arrOfMachines) {
            machine.doWork();
        }
        for (Machine machine : arrOfMachines) {
            machine.stopWork();
        }
    }
}
