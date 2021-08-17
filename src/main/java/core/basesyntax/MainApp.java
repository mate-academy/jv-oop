package core.basesyntax;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Machine> listMachine = List.of(new Truck(), new Bulldozer(), new Excavator());
        for (Machine machine : listMachine) {
            machine.doWork();
        }
        for (Machine machine : listMachine) {
            machine.stopWork();
        }
    }
}
