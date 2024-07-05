package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] buildingMachines = new Machine[] {new Bulldozer(), new Excavator(), new Truck()};
        for (int i = 0; i < buildingMachines.length; i++) {
            buildingMachines[i].doWork();
            buildingMachines[i].stopWork();
        }
    }
}
