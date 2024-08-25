package core.basesyntax;

public class MainApp {

    public static void main() {

        Machine[] machines = new Machine[3];
        machines[0] = new Bulldozer();
        machines[1] = new Excavator();
        machines[2] = new Truck();
        Machine[] machines = {Bulldozer, Excavator, Truck};
        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }

    }
}
