package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[3];
        machineArray[0] = new Truck();
        machineArray[1] = new Bulldozer();
        machineArray[2] = new Excavator();

        for (Machine el : machineArray) {
            el.doWork();
            el.stopWork();
        }
    }
}
