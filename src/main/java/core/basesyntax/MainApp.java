package core.basesyntax;

import machines.Bulldozer;
import machines.Excavator;
import machines.Machine;
import machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[] {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
