package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer("bulldozer");
        Truck truck = new Truck("truck");
        Excavator excavator = new Excavator("excavator");

        bulldozer.doWork();
        bulldozer.stopWork();

        truck.doWork();
        truck.stopWork();

        excavator.doWork();
        excavator.stopWork();
    }
}
