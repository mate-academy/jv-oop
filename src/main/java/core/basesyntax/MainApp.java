package core.basesyntax;

import core.garage.Bulldozer;
import core.garage.Excavator;
import core.garage.Machine;
import core.garage.Truck;

public class MainApp {
    public static void main(String[] args) {
        Machine truckMan = new Truck();
        Machine bulldozerCaterpillar =new Bulldozer();
        Machine excavatorKomatsu = new Excavator();

        truckMan.doWork();
        bulldozerCaterpillar.doWork();
        excavatorKomatsu.doWork();

        truckMan.stopWork();
        bulldozerCaterpillar.stopWork();
        excavatorKomatsu.stopWork();
    }

}
