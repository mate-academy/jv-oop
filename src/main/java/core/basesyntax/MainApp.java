package core.basesyntax;

import core.machines.Bulldozer;
import core.machines.Excavator;
import core.machines.Machine;
import core.machines.Truck;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new Bulldozer());
        machines.add(new Excavator());
        machines.add(new Truck());
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
