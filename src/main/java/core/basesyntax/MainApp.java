package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        System.out.println();

        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        System.out.println();

        Machine truck = new Truck();
        truck.doWork();
        truck.stopWork();
        System.out.println();
    }
}
