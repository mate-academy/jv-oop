package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();
        Machine [] arrayMachines = {Truck, Bulldozer, Excavator};
        for (Machine machine : arrayMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
