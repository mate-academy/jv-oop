package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

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
