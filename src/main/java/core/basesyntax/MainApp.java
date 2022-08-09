package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine Truck = new Truck() ;
        Machine Bulldozer = new Bulldozer() ;
        Machine Excavator = new Excavator() ;
        Machine [] cars = new Machine[] {Truck, Bulldozer, Excavator} ;
        for (Machine car : cars) {
            if (car != null) {
                car.doWork();
                car.stopWork();
            }
        }
    }
}
