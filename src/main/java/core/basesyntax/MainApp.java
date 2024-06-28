package core.basesyntax;

import core.basesyntax.machine.Machine;
import core.basesyntax.machine.impl.Bulldozer;
import core.basesyntax.machine.impl.Excavator;
import core.basesyntax.machine.impl.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        doWork(machines);
        stopWork(machines);
    }

    private static void doWork(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
        System.out.println("All cars started their work!\n");
    }

    private static void stopWork(Machine[] machines) {
        for (Machine machine : machines) {
            machine.stopWork();
        }
        System.out.println("All cars stopped their work!\n");
    }
}
