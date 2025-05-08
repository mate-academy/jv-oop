package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine buldozer = new Bulldozer();
        Machine excavator = new Excavator();
        truck.doWork();
        buldozer.doWork();
        excavator.doWork();
        truck.stopWork();
        buldozer.stopWork();
        excavator.stopWork();
    }
}
