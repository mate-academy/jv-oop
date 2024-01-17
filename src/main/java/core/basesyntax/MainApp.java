package core.basesyntax;

public class MainApp {
    void main(String[] args) {
        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
    }
}
