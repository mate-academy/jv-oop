package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavatorTom = new Excavator();
        Machine bulldozerJohnny = new Bulldozer();
        Machine truckMark = new Truck();
        excavatorTom.doWork();
        bulldozerJohnny.doWork();
        truckMark.doWork();
        excavatorTom.stopWork();
        bulldozerJohnny.stopWork();
        truckMark.stopWork();
    }
}
