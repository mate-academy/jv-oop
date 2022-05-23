package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Truck.setName("Truck");

        Machine Bulldozer = new Bulldozer();
        Bulldozer.setName("Bulldozer");

        Machine Excavator = new Excavator();
        Excavator.setName("Excavator");

        Machine[] array = new Machine[] {Truck, Bulldozer, Excavator};
        for (Machine machine : array) {
            machine.doWork();
        }
        for (Machine machine : array) {
            machine.stopWork();
        }
    }
}
