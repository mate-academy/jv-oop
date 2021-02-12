package core.basesyntax;

public class Main {
    public static void main(String[] agrs) {
        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();
    }
}
