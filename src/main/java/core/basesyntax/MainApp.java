package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck1 = new Truck();
        truck1.doWork();
        truck1.stopWork();

        Machine bulldozer1 = new Bulldozer();
        bulldozer1.doWork();
        bulldozer1.stopWork();

        Machine excavator1 = new Excavator();
        excavator1.doWork();
        excavator1.stopWork();
    }
}
