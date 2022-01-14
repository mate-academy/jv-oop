package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[3];
        machineArray[0] = new Bulldozer();
        machineArray[1] = new Excavator();
        machineArray[2] = new Truck();

        for (Machine machine : machineArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
