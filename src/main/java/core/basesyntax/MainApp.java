package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] cars = {new Bulldozer(), new Excavator(), new Truck()};
        for (Machine car : cars) {
            car.doWork();
            car.stopWork();
        }

    }
}
