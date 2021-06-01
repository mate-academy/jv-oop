package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine buldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine truck = new Truck();
        buldozer.doWork();
        excavator.doWork();
        truck.doWork();
        buldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }
}
