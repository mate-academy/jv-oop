package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = new Machine[3];
        machinesArray[0] = new Truck();
        machinesArray[1] = new Bulldozer();
        machinesArray[2] = new Excavator();
        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}