package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine machine: machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
