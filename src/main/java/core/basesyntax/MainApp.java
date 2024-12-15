package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machineList = new Machine[3];
        machineList[0] = new Bulldozer();
        machineList[1] = new Excavator();
        machineList[2] = new Truck();
        for (Machine machine : machineList) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
