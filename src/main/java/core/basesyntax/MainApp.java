package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Truck truck = new Truck();
        Excavator excavator = new Excavator();
        Machine [] machines = new Machine[] {bulldozer,truck,excavator};
        bulldozer.doWork();
        truck.doWork();
        excavator.doWork();
        bulldozer.stopWork();
        truck.stopWork();
        excavator.stopWork();
    }
}
