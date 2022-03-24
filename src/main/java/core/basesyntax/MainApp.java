package core.basesyntax;

public class MainApp {
    private static final int MACHINES_COUNT = 3;

    public static void main(String[] args) {
        Machine[] machines = new Machine[MACHINES_COUNT];
        machines[0] = new Bulldozer();
        machines[1] = new Excavator();
        machines[2] = new Truck();
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
