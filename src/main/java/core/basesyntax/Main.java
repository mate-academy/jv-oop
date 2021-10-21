package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        excavator.doWork();
        truck.doWork();
        bulldozer.doWork();

        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
    }
}
