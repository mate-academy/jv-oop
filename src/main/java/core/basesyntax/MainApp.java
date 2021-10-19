package core.basesyntax;

public class MainApp {
    public static void main(String[]args) {
        Machine[] machineArray = new Machine[3];
        machineArray[0] = new Bulldozer();
        machineArray[1] = new Excavator();
        machineArray[2] = new Truck();

        for (int i = 0; i < machineArray.length; i++) {
            machineArray[i].doWork();
            machineArray[i].stopWork();
        }
    }
}
