package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        excavator.model = "Cat";
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.model = "John Deere";
        Truck truck = new Truck();
        truck.model = "Ford";

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();

        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }

}
