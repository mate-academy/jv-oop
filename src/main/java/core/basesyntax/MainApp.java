package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck[] trucks = new Truck[]{
                new Truck(),new Truck(),new Truck(),new Truck()
        };
        for (Truck truck : trucks) {
            truck.doWork();
            truck.stopWork();
        }
        Bulldozer [] bulldozers = new Bulldozer[]{
                new Bulldozer(),new Bulldozer(),new Bulldozer()
        };
        for (Bulldozer bulldozer : bulldozers) {
            bulldozer.doWork();
            bulldozer.stopWork();
        }
        Excavator [] excavators = new Excavator[]{
                new Excavator(),new Excavator()
        };
        for (Excavator excavator : excavators) {
            excavator.doWork();
            excavator.stopWork();
        }
    }
}
