package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck1 = new Truck();
        Machine buldozer1 = new Bulldozer();
        Machine excavator1 = new Excavator();
        truck1.doWork();
        buldozer1.doWork();
        excavator1.doWork();
        truck1.stopWork();
        buldozer1.stopWork();
        excavator1.stopWork();
    }
}
