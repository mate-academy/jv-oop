package core.basesyntax;

public class MainApp {
    public static void main (String[] args) {
        Machine[] Machine = new Machine[3];
        Machine Truck = new Truck();
        Machine Excavator = new Excavator();
        Machine Bulldozer = new Bulldozer();
        Machine[0] = Truck;
        Machine[1] = Excavator;
        Machine[2] = Bulldozer;
        for (Machine machine : Machine) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
