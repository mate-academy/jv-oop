package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {

        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavator = new Excavator();

        bulldozer.doWork();
        bulldozer.stopWork();
        truck.doWork();
        truck.stopWork();
        excavator.doWork();
        excavator.stopWork();
    }
}
