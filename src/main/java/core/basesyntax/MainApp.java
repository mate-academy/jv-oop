package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        // create a Truck object
        Machine truck = new Truck();
        truck.setName("DAF");

        // create a Bulldozer object
        Machine bulldozer = new Bulldozer();
        bulldozer.setName("CAT");

        // create a Excavator object
        Machine excavator = new Excavator();
        excavator.setName("ЄКГ");

        Machine[] machines = new Machine[]{truck, bulldozer, excavator};

        for (Machine machine: machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
