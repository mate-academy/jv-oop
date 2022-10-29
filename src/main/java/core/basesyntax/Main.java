package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine[] MachineArray = new Machine[3];
        MachineArray[0] = new Excavator();
        MachineArray[1] = new Bulldozer();
        MachineArray[2] = new Truck();
    for (int i = 0; i < MachineArray.length; i++) {
        MachineArray[i].doWork();
        MachineArray[i].stopWork();
    }
    }
}
