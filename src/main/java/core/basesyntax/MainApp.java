package core.basesyntax;

public class MainApp {
    public static void mainApp(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine [] machines = new Machine[] { truck, bulldozer, excavator};

        for (Machine allMachines : machines) {
            allMachines.doWork();
        }

        for (Machine allMachines : machines) {
            allMachines.stopWork();
        }
    }
}
