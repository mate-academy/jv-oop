package core.basesyntax;

public class Main {
    public static void main() {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}
