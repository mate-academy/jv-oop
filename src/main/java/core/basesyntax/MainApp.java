package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Bulldozer bulldozerr = new Bulldozer();
        machines[0] = excavator;
        machines[1] = truck;
        machines[2] = bulldozerr;
        for (Machine machine: machines) {
            machine.doWork();
            machine.stoppWork();
        }
    }
}
