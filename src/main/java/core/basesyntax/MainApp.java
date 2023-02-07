package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] heavyMachinesArray = {new Excavator(), new Bulldozer(), new Truck()};
        for (Machine machine : heavyMachinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
