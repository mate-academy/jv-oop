package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] cars = {new Truck(), new Bulldozer(), new Excavator()};
        for(Machine car: cars) {
            car.doWork();
            car.stopWork();
        }
    }

}
