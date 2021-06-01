package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavatorOne = new Excavator();
        Machine truckOne = new Truck();
        Machine bulldozerOne = new Bulldozer();

        excavatorOne.doWork();
        truckOne.doWork();
        bulldozerOne.doWork();

        excavatorOne.stopWork();
        truckOne.stopWork();
        bulldozerOne.stopWork();
    }
}
