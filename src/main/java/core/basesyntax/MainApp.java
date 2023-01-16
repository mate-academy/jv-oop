package core.basesyntax;

public class MainApp {
    Machine excavator = new Excavator();
    Machine bulldozer = new Bulldozer();
    Machine truck = new Truck();

    Machine [] machines = new Machine[]{excavator, bulldozer, truck};

    public void print () {
        for (int i = 0; i < machines.length; i++) {
            excavator.doWork();
            excavator.stopWork();
            bulldozer.doWork();
            bulldozer.stopWork();
            truck.doWork();
            truck.stopWork();
        }
    }
}
