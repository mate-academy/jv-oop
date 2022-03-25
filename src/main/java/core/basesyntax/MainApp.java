package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine[] machines = {bulldozer, truck, excavator};

        doWork(machines);
    }

    public static void doWork(Machine[] machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
