package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};
        for (Machine machine : machines) {
            startWork(machine);
        }
        for (Machine machine : machines) {
            stopWork(machine);
        }
    }

    private static void startWork(Machine machine) {
        machine.doWork();
    }

    private static void stopWork(Machine machine) {
        machine.stopWork();
    }
}

