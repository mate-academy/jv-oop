package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Machine Bulldozer = new Bulldozer();
        Machine Excavator = new Excavator();
        Machine[] Machine = {Truck, Bulldozer, Excavator};
        for (core.basesyntax.Machine machine : Machine) {
            System.out.println(machine.doWork());
            System.out.println(machine.stopWork());
        }
    }
}
