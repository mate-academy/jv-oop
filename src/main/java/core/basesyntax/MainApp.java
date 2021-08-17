package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine excavator = new Excavator();
        excavator.setModel("CAT");
        Machine bulldozer = new Bulldozer();
        bulldozer.setModel("John Deere");
        Machine truck = new Truck();
        truck.setModel("Ford");
        bulldozer.doWork();
        excavator.doWork();
        truck.doWork();
        bulldozer.stopWork();
        excavator.stopWork();
        truck.stopWork();
    }

}
