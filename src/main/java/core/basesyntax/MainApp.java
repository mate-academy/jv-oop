package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] arrayOfMachines = new Machine[] {truck, bulldozer, excavator};
        for (Machine machine : arrayOfMachines) {
            machine.doWork();
            machine.stopWork();
            System.out.println(); // Message separation
        }
    }
}
