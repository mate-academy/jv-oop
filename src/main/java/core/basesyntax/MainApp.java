package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine bulldoser = new Bulldoser();
        Machine truck = new Truck();
        Machine excavator = new Excavator();
        bulldoser.doWork();
        truck.doWork();
        excavator.doWork();
        bulldoser.stopWork();
        truck.stopWork();
        excavator.stopWork();
    }

}
