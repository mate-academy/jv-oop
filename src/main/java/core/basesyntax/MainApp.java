package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[7];

        machines[0] = new Truck();
        machines[1] = new Bulldozer();
        machines[2] = new Excavator();
        machines[3] = new Excavator();
        machines[4] = new Truck();
        machines[5] = new Bulldozer();
        machines[6] = new Truck();

        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }

    }

}
