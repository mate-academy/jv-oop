package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine[] machineArr = new Machine[3];
        machineArr[0] = truck;
        machineArr[1] = bulldozer;
        machineArr[2] = excavator;
        for (Machine machine : machineArr) {
            machine.doWork();
            machine.stopWork();
        }

    }
}
