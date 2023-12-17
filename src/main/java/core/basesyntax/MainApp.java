package core.basesyntax;

import core.basesyntax.machine.Buldozer;
import core.basesyntax.machine.Excavator;
import core.basesyntax.machine.Machine;
import core.basesyntax.machine.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{
                new Buldozer(),
                new Excavator(),
                new Truck()
        };
        System.out.println("Start Program");
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
