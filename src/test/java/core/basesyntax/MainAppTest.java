package core.basesyntax;

import core.basesyntax.MachineBuilders.Bulldozer;
import core.basesyntax.MachineBuilders.Excavator;
import core.basesyntax.MachineBuilders.Machine;
import core.basesyntax.MachineBuilders.Truck;

public class MainAppTest {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();

        Machine[] machines = new Machine[3];
        machines[0] = truck;
        machines[1] = excavator;
        machines[2] = bulldozer;
        for (Machine machine: machines){
            machine.doWork();
            machine.stopWork();
        }
    }

}