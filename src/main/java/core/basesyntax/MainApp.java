package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldozer1 = new Bulldozer();
        Machine excavator1 = new Excavator();
        Machine truck1 = new Truck();

        bulldozer1.doWork();
        excavator1.doWork();
        truck1.doWork();

        bulldozer1.stopWork();
        excavator1.stopWork();
        truck1.stopWork();
    }
}
