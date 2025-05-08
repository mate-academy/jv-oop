package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();

        Machine[] machines = new Machine[3];
        machines[0] = truck;
        machines[1] = excavator;
        machines[2] = bulldozer;

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
