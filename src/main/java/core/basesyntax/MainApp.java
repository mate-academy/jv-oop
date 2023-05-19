package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();

        Machine [] machines = new Machine [3];

        machines[0] = truck;
        machines[1] = bulldozer;
        machines[2] = excavator;


        for (Machine machine : machines) {
            machine.stopWork();
            machine.doWork();
        }

    }
}
