package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] garage = new Machine[]{new Truck(), new Bulldozer(), new Excavator()};

        for (Machine car : garage) {
            car.doWork();
            car.stopWork();
        }
    }
}
