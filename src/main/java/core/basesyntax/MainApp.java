package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] machineArray = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
