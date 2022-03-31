package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine newBulldozer = new Bulldozer();
        Machine newExcavator = new Excavator();
        Machine newTruck = new Truck();
        Machine[] machines = new Machine[]{newBulldozer, newExcavator, newTruck};
        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
