package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machines = new Machine[3];
        machines[0] = truck;
        machines[1] = bulldozer;
        machines[2] = excavator;

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }

}
