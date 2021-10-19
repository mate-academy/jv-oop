package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        excavator.doWork();
        bulldozer.doWork();
        truck.doWork();
        excavator.stopWork();
        bulldozer.stopWork();
        truck.stopWork();
    }
}
