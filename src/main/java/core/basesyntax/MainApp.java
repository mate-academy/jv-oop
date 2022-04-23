package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.setName("Ave");

        Machine truck = new Truck();
        truck.setName("John");

        Machine bulldozer = new Bulldozer();
        bulldozer.setName("David");

        Machine[] machines = new Machine[]{excavator, truck, bulldozer};

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
