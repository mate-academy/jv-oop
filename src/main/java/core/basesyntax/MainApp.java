package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck("Truck");
        machines[1] = new Bulldozer("Bulldozer");
        machines[2] = new Excavator("Excavator");

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
