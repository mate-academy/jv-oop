package core.basesyntax;

public class MainApp {

    private Machine truck = new Truck();
    private Machine bulldozer = new Bulldozer();
    private Machine excavator = new Excavator();
    private Machine[] machineList = new Machine[] {
            truck,
            bulldozer,
            excavator
    };

    public void eachWork() {
        for (Machine machine : machineList) {
            machine.doWork();
        }
    }

    public void eachStop() {
        for (Machine machine : machineList) {
            machine.stopWork();
        }
    }
}
