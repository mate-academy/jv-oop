package core.basesyntax;

import working.technique.Bulldozer;
import working.technique.Excavator;
import working.technique.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineList = {new Truck(), new Bulldozer(),new Excavator()};

        for (Machine machine : machineList) {
            machine.doWork();
        }
        for (Machine machine : machineList) {
            machine.stopWork();
        }
    }
}
