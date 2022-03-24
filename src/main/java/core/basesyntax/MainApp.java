package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();

        Machine[] machines = new Machine[3];
        machines[0] = excavator;
        machines[1] = bulldozer;
        machines[2] = truck;

        for (Machine machine : machines) {
            machine.doWork();
        }
        for (Machine machine : machines) {
            machine.stopWork();
        }
    }
}
