package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] arrayOfMachines = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine workMachine : arrayOfMachines) {
            workMachine.doWork();
            workMachine.stopWork();
        }
    }
}
