package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = {new Truck(), new Bulldozer(), new Excavator()};

        for (Machine car: machines) {
            car.doWork();
            car.stopWork();
            System.out.println("\n");
        }
    }
}