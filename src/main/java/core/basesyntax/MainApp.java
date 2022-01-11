package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        truck.doWork();
        truck.doStopWork();

        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.doStopWork();

        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.doStopWork();
    }
}
