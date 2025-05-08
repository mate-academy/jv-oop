package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        final Machines[] machines = new Machines[3];
        machines[0] = new Bulldozer();
        machines[1] = new Excavator();
        machines[2] = new Truck();
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
