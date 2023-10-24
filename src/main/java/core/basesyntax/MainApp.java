package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = new Machine[3];
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        machinesArray[0] = excavator;
        machinesArray[1] = truck;
        machinesArray[2] = bulldozer;
        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
