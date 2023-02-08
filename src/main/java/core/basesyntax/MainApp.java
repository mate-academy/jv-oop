package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] vehicles = {new Bulldozer(), new Excavator(), new Truck()};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].doWork();
            vehicles[i].stopWork();
        }

    }

}
