package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        Machine truck = new Truck();
        machines[0] = truck;
        Machine bulldozer = new Bulldozer();
        machines[1] = bulldozer;
        Machine excavator = new Excavator();
        machines[2] = excavator;
        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
