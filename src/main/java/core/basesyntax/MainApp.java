package core.basesyntax;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Machine> machines = List.of(new Excavator(), new Bulldozer(), new Truck());
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
