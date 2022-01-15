package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        truck.work();
        bulldozer.work();
        excavator.work();
        truck.stopWork();
        bulldozer.stopWork();
        excavator.stopWork();
    }

}
