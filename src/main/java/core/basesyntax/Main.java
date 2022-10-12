package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();

        bulldozer.doWork();
        bulldozer.stopWork();
        excavator.doWork();
        excavator.stopWork();
        truck.doWork();
        truck.stopWork();
    }
}
