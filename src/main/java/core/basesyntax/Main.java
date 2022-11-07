package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] machineArray = new Machine[3];
        machineArray[0] = new Excavator();
        machineArray[1] = new Bulldozer();
        machineArray[2] = new Truck();
        for (int i = 0; i < machineArray.length; i++) {
            machineArray[i].doWork();
            machineArray[i].stopWork();
        }
    }
}
