package core.basesyntax;

public class MainAppTest {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
    }
}