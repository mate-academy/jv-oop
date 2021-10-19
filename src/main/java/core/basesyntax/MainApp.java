package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Truck;
import core.basesyntax.workflow.Machine;
import java.util.List;

public class MainApp {
    public static void main(String[] arguments) {
        List<Machine> machines = List.of(new Excavator(), new Bulldozer(), new Truck());
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
