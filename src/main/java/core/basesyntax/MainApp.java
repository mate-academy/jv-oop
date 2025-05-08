package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truckMachine = new Truck();
        Machine bulldozerMachine = new Bulldozer();
        Machine excavatorMachine = new Excavator();

        truckMachine.doWork();
        bulldozerMachine.doWork();
        excavatorMachine.doWork();

        truckMachine.stopWork();
        bulldozerMachine.stopWork();
        excavatorMachine.stopWork();
    }
}
