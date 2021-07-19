package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Excavator excavator = new Excavator();
        excavator.setModel("CAT");
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setModel("John Deere");
        Truck truck = new Truck();
        truck.setModel("Ford");

        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();

        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }

}
