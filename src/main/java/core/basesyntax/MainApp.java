package core.basesyntax;

public class MainApp {
    private static Machine[] machines = {new Truck(),new Bulldozer(),new Excavator()};

    public static Machine[] getMachines() {
        return machines;
    }

    public static void setMachines(Machine[] machines) {
        MainApp.machines = machines;
        for (Machine machine : getMachines()) {
            machine.stopWork();
            machine.doWork();

        }
    }
}

