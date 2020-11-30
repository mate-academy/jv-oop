package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        Buldozer buldozer = new Buldozer();
        Truck truck = new Truck();

        excavator.doWork();
        buldozer.doWork();
        truck.doWork();

        excavator.stopWork();
        buldozer.stopWork();
        truck.stopWork();
    }
}
