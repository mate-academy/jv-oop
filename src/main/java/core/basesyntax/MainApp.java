package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Bulldozer bulldozer = new Bulldozer();

        Machine[] machines = {truck, excavator, bulldozer};

        for (Machine machine: machines) {
            machine.doWork();
        }

        for (Machine machine: machines) {
            machine.stopWork();
        }
    }
}

