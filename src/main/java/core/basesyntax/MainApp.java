package core.basesyntax;

import machines.Bulldozer;
import machines.Excavator;
import machines.Machine;
import machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[] {new Excavator(), new Bulldozer(), new Truck()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
