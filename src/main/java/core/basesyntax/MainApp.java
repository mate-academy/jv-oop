package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] buildingMachines = new Machine[] {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine buildingMachine : buildingMachines) {
            buildingMachine.doWork();
            buildingMachine.stopWork();
        }
    }
}
