package core.basesyntax;

public class MainApp {
    public static void main(String [] args) {
        System.out.println("------------------");
        Truck truck = new Truck();
        truck.doWork();
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.doWork();
        Excavator excavator = new Excavator();
        excavator.doWork();
        System.out.println("-------------------");
        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
        System.out.println("-------------------");
    }
}
