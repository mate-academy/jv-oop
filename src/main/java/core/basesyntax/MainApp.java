package core.basesyntax;

public class MainApp {
    private static Machine truck = new Truck();
    private static Machine bulldozer = new Bulldozer();
    private static Machine excavator = new Excavator();

    public static void main(String[] args) {
        truck.doWork();
        excavator.doWork();
        bulldozer.doWork();

        truck.stopWork();
        excavator.stopWork();
        bulldozer.stopWork();
    }
}

