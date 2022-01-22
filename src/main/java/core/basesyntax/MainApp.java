package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();

        truck.doWork();
        bulldozer.doWork();

        truck.stopWork();
        bulldozer.stopWork();
    }
}
