package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine excavator1 = new Excavator();
        Machine bulldozer1 = new Bulldozer();
        Machine truck1 = new Truck();

        excavator1.doWork();
        bulldozer1.doWork();
        truck1.doWork();

        excavator1.stopWork();
        bulldozer1.stopWork();
        truck1.stopWork();
    }
}
