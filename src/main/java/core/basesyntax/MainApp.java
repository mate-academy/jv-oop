package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        machines[0] = truck;
        machines[1] = excavator;
        machines[2] = bulldozer;
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
