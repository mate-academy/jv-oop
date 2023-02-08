package core.basesyntax;

import machines.Bulldozer;
import machines.Excavator;
import machines.Machine;
import machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] cars = { new Bulldozer(), new Excavator(), new Truck()};

        for (Machine machine : cars) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
