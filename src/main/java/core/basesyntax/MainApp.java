package core.basesyntax;

public class MainApp {
    public static void machineWork() {
        Machine[] machines = new Machine[]{new Excavator(),new Bulldozer(),new Truck()};
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
