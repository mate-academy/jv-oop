package core.basesyntax;

import vehicles.Bulldozer;
import vehicles.Excavator;
import vehicles.Machine;
import vehicles.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayOfVeihcles = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine veihcle : arrayOfVeihcles) {
            veihcle.doWork();
        }
        System.out.println();
        for (Machine veihcle : arrayOfVeihcles) {
            veihcle.stopWork();
        }
    }
}
