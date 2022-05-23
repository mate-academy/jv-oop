package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Truck = new Truck();
        Truck.setName("Truck");
        Truck.doWork();
        Truck.stopWork();

        Machine Bulldozer = new Bulldozer();
        Bulldozer.setName("Bulldozer");
        Bulldozer.doWork();
        Bulldozer.stopWork();

        Machine Excavator = new Excavator();
        Excavator.setName("Excavator");
        Excavator.doWork();
        Excavator.stopWork();


        Machine[] array = {Truck, Bulldozer, Excavator};
        for (Machine machine : array) {
            System.out.println(machine);
        }
    }
}
