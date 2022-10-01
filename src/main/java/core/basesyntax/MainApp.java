package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();
        Machine [] machineArray = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine: machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
