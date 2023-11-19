package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine[] arrayOfVehicles = {new Excavator(), new Bulldozer(), new Truck()};

        for (Machine vehicle : arrayOfVehicles) {
            vehicle.doWork();
            vehicle.stopWork();
            System.out.println();
        }
    }
}
