package core.basesyntax;

import mashines.Bulldozer;
import mashines.Excavator;
import mashines.Truck;

public class MainApp {
    public static void main(String[] args) {
        Mashine[] machines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Mashine mashine: machines) {
            mashine.doWork();
            mashine.doStop();
        }
    }
}
