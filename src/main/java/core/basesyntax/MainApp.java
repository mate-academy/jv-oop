package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Machine> machines = new ArrayList<>();

        machines.add(new Bulldozer());
        machines.add(new Truck());
        machines.add(new Excavator());

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
