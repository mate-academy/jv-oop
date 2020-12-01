package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        Machine buldozer = new Buldozer();
        Machine truck = new Truck();

        excavator.doWork();
        buldozer.doWork();
        truck.doWork();

        excavator.stopWork();
        buldozer.stopWork();
        truck.stopWork();
    }
}
