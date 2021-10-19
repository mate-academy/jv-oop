package core.basesyntax;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(truck);
        machines.add(bulldozer);
        machines.add(excavator);

        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
