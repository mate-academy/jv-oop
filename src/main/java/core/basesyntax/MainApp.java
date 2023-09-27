package core.basesyntax;

public class MainApp {
    private Machine truck = new Truck();
    private Machine bulldozer = new Bulldozer();
    private Machine excavator = new Excavator();
    private Machine[] machines = {truck, bulldozer, excavator};

    public static void runMachines(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
