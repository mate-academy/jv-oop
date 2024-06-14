package core.basesyntax;

public class MainApp {
    private final Machine truck = new Truck();

    private final Machine excavator = new Excavator();

    private final Machine bulldozer = new Bulldozer();

    private final Machine[] machines = {getTruck(), getBulldozer(), getExcavator()};

    public Machine getTruck() {
        return truck;
    }

    public Machine getBulldozer() {
        return bulldozer;
    }

    public Machine getExcavator() {
        return excavator;
    }

    public Machine[] getMachines() {
        return machines;
    }

    public void isWork(String args) {
        for (Machine machine : getMachines()) {
            machine.doWork();
        }
    }

    public void isStoppedWorking(String args) {
        for (Machine machine : getMachines()) {
            machine.stopWork();
        }
    }
}
