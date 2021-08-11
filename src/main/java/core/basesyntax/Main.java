package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();

        truck.spotWork();
        bulldozer.spotWork();
        excavator.spotWork();
    }
}
