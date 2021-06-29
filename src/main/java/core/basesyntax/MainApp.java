package core.basesyntax;

import core.basesyntax.machines.Bulldozer;
import core.basesyntax.machines.Excavator;
import core.basesyntax.machines.Machine;
import core.basesyntax.machines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        System.out.println("START:");
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        System.out.println();
        System.out.println("STOP:");
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }
}
