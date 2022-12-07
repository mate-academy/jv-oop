package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayOfMachines = {new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
