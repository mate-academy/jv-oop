package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machinesArray = new Machine[3];
        machinesArray[0] = new Bulldozer();
        machinesArray[1] = new Excavator();
        machinesArray[2] = new Truck();

        for (Machine machine : machinesArray) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
