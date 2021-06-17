package core.basesyntax;

public class MainApp {

    public static void main(String[] arg) {
        Machine truckMan = new Truck("F2000", "disel", 2001, 4);
        Machine bulldozerKomatsu = new Bulldozer("D155", "disel", 2007, 0);
        Machine excavatorHitachi = new Excavator("EX100", "disel", 2004, 0);
        truckMan.doWork();
        bulldozerKomatsu.doWork();
        excavatorHitachi.doWork();
        truckMan.stopWork();
        bulldozerKomatsu.stopWork();
        excavatorHitachi.stopWork();
    }
}
