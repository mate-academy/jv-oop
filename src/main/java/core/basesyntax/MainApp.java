package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozerExample = new Bulldozer();
        Machine excavatorExample = new Excavator();
        Machine truckExample = new Truck();
        bulldozerExample.doWork();
        excavatorExample.doWork();
        truckExample.doWork();
        bulldozerExample.stopWork();
        excavatorExample.stopWork();
        truckExample.stopWork();
    }
}
