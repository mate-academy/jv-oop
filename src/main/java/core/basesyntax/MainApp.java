package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine buldozer = new Buldozer();
        Machine excavator = new Excavator();

        List<Machine> machines = new ArrayList<>();
        machines.add(truck);
        machines.add(buldozer);
        machines.add(excavator);

        machines.forEach(machine -> machine.doWork());
        machines.forEach(machine -> machine.stopWork());
    }
}
