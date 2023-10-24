package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[3];
        machineArray[0] = new Excavator();
        machineArray[1] = new Truck();
        machineArray[2] = new Bulldozer();
        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
