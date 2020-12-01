package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Bulldozer();
        machines[1] = new Excavator();
        machines[2] = new Truck();

        for (Machine vehicles: machines) {
            vehicles.doWork();
        }

        for (Machine vehicles: machines) {
            vehicles.stopWork();
        }
    }
}
