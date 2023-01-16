package core.basesyntax;

public class MainApp {
    private Machine excavator = new Excavator();
    private Machine bulldozer = new Bulldozer();
    private Machine truck = new Truck();

    private Machine [] machines = new Machine[]{excavator, bulldozer, truck};

    public Machine getExcavator() {
        return excavator;
    }

    public Machine getBulldozer() {
        return bulldozer;
    }

    public Machine getTruck() {
        return truck;
    }

    public Machine[] getMachines() {
        return machines;
    }

    public void print() {
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
