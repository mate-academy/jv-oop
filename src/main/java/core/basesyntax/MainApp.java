package core.basesyntax;

public class MainApp {
    public static void main() {
        Machine[] machines = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}

