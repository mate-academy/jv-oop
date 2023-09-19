package core.basesyntax;

import core.basesyntax.Truck;
import core.basesyntax.Bulldozer;
import core.basesyntax.Excavator;
public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] allMachine = new Machine[3];
        allMachine[0] = truck;
        allMachine[1] = bulldozer;
        allMachine[2] = excavator;
        for (Machine machine: allMachine) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
