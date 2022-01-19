package core.basesyntax;
public class MainApp {
    public static void main(String[] args) {

        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Excavator excavator = new Excavator();

        bulldozer.doWork();
        bulldozer.stopWork();

        truck.doWork();
        truck.stopWork();

        excavator.doWork();
        excavator.stopWork();
    }
}
