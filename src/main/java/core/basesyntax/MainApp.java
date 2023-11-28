package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();
    Machine[] machineList = new Machine[] {
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
