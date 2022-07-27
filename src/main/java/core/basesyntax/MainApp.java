package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Excavator = new Excavator();
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();

        Machine[] ListOfMachines = new Machine[] {Excavator, Truck, Bulldozer};
        for (Machine machine : ListOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
