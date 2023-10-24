package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        machines[0] = truck;
        machines[1] = bulldozer;
        machines[2] = excavator;

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
