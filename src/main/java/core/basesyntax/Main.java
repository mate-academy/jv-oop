package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine [] arrayOfMachines = {truck,bulldozer,excavator};
        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
