package core.basesyntax;

import vehicles.Bulldozer;
import vehicles.Excavator;
import vehicles.Machine;
import vehicles.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine veihcle : machines) {
            veihcle.doWork();
        }
        System.out.println();
        for (Machine veihcle : machines) {
            veihcle.stopWork();
        }
    }
}
