package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] cars = {new Truck(), new Bulldozer(), new Excavator()};

        for (int i = 0; i < cars.length; i++) {
            cars[i].doWork();
            cars[i].stopWork();
        }
    }
}