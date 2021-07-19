package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        excavator.doWork();
        excavator.stopWork();
        System.out.println();

        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        bulldozer.stopWork();
        System.out.println();

        Truck truck = new Truck();
        truck.doWork();
        truck.stopWork();
        System.out.println();
    }
}
