package core.basesyntax;

import machines.Bulldozer;
import machines.Excavator;
import machines.Machine;
import machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine buldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine[] machinesArray = {buldozer, excavator, truck};

        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
