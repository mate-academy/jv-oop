package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayOfMachines = new Machine[]{new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
