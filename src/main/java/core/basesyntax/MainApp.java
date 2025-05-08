package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine machineInSector1 = new Bulldozer();
        Machine machineInSector2 = new Excavator();
        Machine machineInSector3 = new Truck();
        machineInSector1.doWork();
        machineInSector2.doWork();
        machineInSector3.doWork();
        machineInSector1.stopWork();
        machineInSector2.stopWork();
        machineInSector3.stopWork();
    }
}
