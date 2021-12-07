package core.basesyntax;

public class MainAppTest {

    public static void main(String[] args) {
        MainApp truck = new Truck();
        MainApp bulldozer = new Bulldozer();
        MainApp excavator = new Excavator();

        truck.doWork();
        truck.stopWork();

        bulldozer.doWork();
        bulldozer.stopWork();

        excavator.doWork();
        excavator.stopWork();
    }
}