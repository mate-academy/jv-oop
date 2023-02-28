package core.basesyntax;

public class MainApp {
    public static void main (String[] args) {
        Machine Truck = new Truck();
        Machine Excavator = new Excavator();
        Machine Bulldozer = new Bulldozer();
        Machine[] Machines = {Truck, Excavator, Bulldozer};
        for (Machine machine : Machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
