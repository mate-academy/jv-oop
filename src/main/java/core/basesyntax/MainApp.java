package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine [] vehicles = new Machine[] {new Truck(), new Excavator(), new Bulldozer()};
        for (Machine vehicle : vehicles) {
            vehicle.doWork();
        }
        for (Machine vehicle : vehicles) {
            vehicle.stopWork();
        }
    }
}
