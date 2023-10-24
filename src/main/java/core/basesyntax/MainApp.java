package core.basesyntax;

import core.basesyntax.machine.Bulldozer;
import core.basesyntax.machine.Excavator;
import core.basesyntax.machine.Machine;
import core.basesyntax.machine.Truck;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        List<Machine> machines = new ArrayList<>();
        machines.add(excavator);
        machines.add(truck);
        machines.add(bulldozer);

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
