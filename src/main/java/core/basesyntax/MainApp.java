package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        machinesActivities();
    }

    private static void machinesActivities() {

        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        Machine[] machines = {excavator, truck, bulldozer};

        for (Machine machine : machines) {

            machine.doWork();
            machine.stopWork();
        }
    }
}
