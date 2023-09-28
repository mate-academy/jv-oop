package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        Machine truck = new Truck("MAN", "Petrol", 14.7, 18);
        Machine bulldozer = new Bulldozer("CAT", "Diesel", 45.7, true);
        Machine excavator = new Excavator("CAT", "Diesel", 52.4, true);
        Machine [] machines = new Machine[]{truck, bulldozer, excavator};

        for (Machine vehicle : machines) {
            vehicle.doWork();
            vehicle.stopWork();
        }
    }

}
