package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine[] machinesArray = new Machine[3];
        machinesArray[0] = excavator;
        machinesArray[1] = truck;
        machinesArray[2] = bulldozer;
        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
