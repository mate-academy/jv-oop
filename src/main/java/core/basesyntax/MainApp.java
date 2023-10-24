package core.basesyntax;

import core.basesyntax.machine.Bulldozer;
import core.basesyntax.machine.Excavator;
import core.basesyntax.machine.Machine;
import core.basesyntax.machine.Truck;

public class MainApp {
    // STUPID, USE MAIN METHOD
    private static Machine[] machines = new Machine[3];
    private static void initialize() {
        machines[0] = new Excavator();
        machines[1] = new Bulldozer();
        machines[2] = new Truck();
        
    }

    public static void execute() {
        initialize();
        for (Machine m:machines) {
            m.doWork();
            m.stopWork();
        }
    }

    public static void main(String[] args) {
        execute();
    }
}
