package core.basesyntax;

import core.machines.Bulldozer;
import core.machines.Excavator;
import core.machines.Machine;
import core.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine[] machines = new Machine[] {excavator, bulldozer, truck};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
