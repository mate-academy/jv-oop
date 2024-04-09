package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck(1);
        Machine buldozer = new Bulldozer(1);
        Machine excavator = new Excavator(1);

        Machine[] machines = new Machine[3];
        machines[0] = truck;
        machines[1] = buldozer;
        machines[2] = excavator;

        for (int i = 0; i < machines.length; i++) {
            machines[i].doWork();
            machines[i].stopWork();
        }
    }
}
