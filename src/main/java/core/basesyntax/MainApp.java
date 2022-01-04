package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        truck.setName("Truck");

        Machine excavator = new Excavator();
        excavator.setName("Excavator");

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("Bulldozer");

        Machine[] machines = new Machine[]{truck, excavator, bulldozer};

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}


