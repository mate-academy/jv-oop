package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {

        Machine[] cars = new Machine[] {new Excavator(), new Truck(), new Bulldozer()};

        for (Machine car : cars) {
            car.doWork();
            car.stopWork();
        }
    }

}
