package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[3];
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        machineArray[0] = truck;
        machineArray[1] = excavator;
        machineArray[2] = bulldozer;
        for (Machine currentMachine : machineArray) {
            currentMachine.doWork();
            currentMachine.stopWork();
        }
    }
}
