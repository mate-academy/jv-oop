package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck();
        truck.setName("Truck");

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("Bulldozer");

        Machine excavator = new Excavator();
        excavator.setName("Excavator");

        Machine[] machines = new Machine[]{truck, bulldozer, excavator};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
