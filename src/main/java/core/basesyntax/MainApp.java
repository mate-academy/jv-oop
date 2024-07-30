package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine truck = new Truck();
        Machine buldozer = new Buldozer();
        Machine excavator = new Excavator();

        truck.doWork();
        truck.stopWork();
        buldozer.doWork();
        buldozer.stopWork();
        excavator.doWork();
        excavator.stopWork();

    }

}
