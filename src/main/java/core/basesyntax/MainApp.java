package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Truck truck = new Truck();
        Buldozer buldozer = new Buldozer();
        Machine[] machinesArray = new Machine[3];
        machinesArray[0] = excavator;
        machinesArray[1] = truck;
        machinesArray[2] = buldozer;
        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
