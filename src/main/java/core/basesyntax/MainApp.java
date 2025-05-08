package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Machine[] arrayMachines = {truck,bulldozer,excavator};
        for (Machine machine: arrayMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
