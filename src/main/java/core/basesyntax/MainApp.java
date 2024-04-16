package core.basesyntax;

public class MainApp {
    public void printInfo() {
        Machine[] machines = new Machine[3];
        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
