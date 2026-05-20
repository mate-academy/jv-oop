package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truc = new Truck();
        truc.doWork();
        truc.stopWork();

        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();

        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
    }
}
