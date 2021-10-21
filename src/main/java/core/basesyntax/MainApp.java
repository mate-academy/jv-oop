package core.basesyntax;

public class MainApp {
    public static void main() {

        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Excavator();
        machines[2] = new Bulldozer();
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
