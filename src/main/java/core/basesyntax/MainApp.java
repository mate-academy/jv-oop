package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truckVolvo = new Truck();
        truckVolvo.doWork();
        truckVolvo.stopWork();
        Machine bulldozerCat = new Bulldozer();
        bulldozerCat.doWork();
        bulldozerCat.stopWork();
        Machine excavatorHyundai = new Excavator();
        excavatorHyundai.doWork();
        excavatorHyundai.stopWork();
    }
}
