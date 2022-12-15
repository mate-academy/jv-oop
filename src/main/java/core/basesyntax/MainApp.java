package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine[] machineArray = new Machine[3];

        machineArray[0] = new Truck();
        machineArray[1] = new Buldozer();
        machineArray[2] = new Excavator();

        for (Machine m : machineArray) {
            m.doWork();
            m.stopWork();
        }
    }
}
