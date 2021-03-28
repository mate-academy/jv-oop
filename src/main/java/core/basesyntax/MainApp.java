package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine macT = new Truck();
        Machine macB = new Bulldozer();
        Machine macE = new Excavator();

        macT.doWork();
        macB.doWork();
        macE.doWork();

        macT.stopWork();
        macB.stopWork();
        macE.stopWork();
    }
}
